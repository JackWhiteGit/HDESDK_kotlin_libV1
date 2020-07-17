package com.sdk.request

import android.util.Log
import com.sdk.auth.Auth
import org.json.JSONObject
import java.io.*
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder


class RequestHttp(userEmail: String?, apikey: String?, hdeUrl: String?) {
    private var user_email: String? = userEmail
    private var apikey: String? = apikey
    private var hde_url: String? = hdeUrl
    private var auth_token = Auth().AuthKey(userEmail, apikey)

    fun getAuthToken(): String?{
        return this.auth_token
    }

    fun Request(
        request_type: String?,
        options_arr: Map<String?, String?>?
    ): String? {
        var line = ""
        var dataPost = ""
        var dataGet = ""
        var output = false
        var connection: HttpURLConnection? = null
        var reader: BufferedReader? = null
        var postDataLength = 0
        val buffer = StringBuilder()
        val options = RequestPresets().RequestOptions(request_type!!, options_arr)
        if (options["method"] == "GET") {
            dataGet = RequestPresets().RequestData(request_type!!, options_arr).toString()
        } else if (options["method"] == "POST" || options["method"] == "PUT"
        ) {
            output = true
            dataPost = RequestPresets().RequestData(request_type!!, options_arr).toString()
            postDataLength = dataPost.length
        }

        try {
            val url =
                URL(hde_url + "/api/v2" + options["url"] + dataGet)
            connection = url.openConnection() as HttpURLConnection
            connection.requestMethod = options["method"]
            connection!!.addRequestProperty("Authorization", "Basic " + auth_token)
            connection.addRequestProperty("Content-Type", options["content_type"])
            connection.doOutput = output
            if (postDataLength > 0) {
                connection.setRequestProperty(
                    "Content-Length",
                    Integer.toString(postDataLength)
                )
                if(options["content_type"] == "application/x-www-form-urlencoded"){
                    DataOutputStream(connection.outputStream)
                        .use { wr -> wr.write(dataPost.toByteArray()) }
                }else if(options["content_type"] == "application/json"){
                    Log.d("wtf", dataPost)

                    DataOutputStream(connection.outputStream)
                        .use { wr -> wr.writeChars(dataPost) }
                }

            }
            connection.connect()
            val stream = connection.inputStream
            reader = BufferedReader(InputStreamReader(stream))
            while (reader.readLine().also { line = it } != null) {
                buffer.append(line).append("\n")
                Log.d("Response: ", "> $line")
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return buffer.toString()
    }

}