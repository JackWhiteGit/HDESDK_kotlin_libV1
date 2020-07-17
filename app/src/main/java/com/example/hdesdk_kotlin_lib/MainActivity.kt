package com.example.hdesdk_kotlin_lib

import android.os.AsyncTask
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.sdk.SDKinit

class MainActivity : AppCompatActivity() {
    var txtJson: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtJson = findViewById<View>(R.id.output) as TextView
        RequestTask().execute()
    }
    class RequestTask() : AsyncTask<Void, Void, String>() {
        override fun doInBackground(vararg params: Void?): String? {
            val options: Map<String?, String?> = mapOf(
                "title" to "Problem with email",
                "description" to "Problem with email",
                "sla_date" to "20.07.2020 00:00",
                "priority_id" to "1",
                "user_email" to "example@example.com",
                "create_from_user" to "1"
            )

            val hdesdk = SDKinit(
                "example@example.com",
                "apiKey",
                "https://example.helpdeskeddy.com"
            )
            return hdesdk.TicketCreate(options)
        }

        override fun onPreExecute() {
            super.onPreExecute()
            // ...
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            // ...
        }
    }

}