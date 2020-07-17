package com.sdk.auth

import android.util.Base64
import java.nio.charset.StandardCharsets

class Auth {
    fun AuthKey(user_email: String?, api_key: String?): String? {
        val access_token: String
        val originalInput = "$user_email:$api_key"
        val data =
            originalInput.toByteArray(StandardCharsets.UTF_8)
        access_token = Base64.encodeToString(data, Base64.DEFAULT)
        return access_token
    }
}