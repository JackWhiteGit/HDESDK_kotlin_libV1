package com.sdk.user

import com.sdk.request.RequestHttp

class User() {
    var answer: String? = null

    fun UserListGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("UserListGet", options)
        return answer
    }

    fun UserGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("UserGet", options)
        return answer
    }

    fun UserCreate(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("UserCreate", options)
        return answer
    }

    fun UserUpdate(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("UserUpdate", options)
        return answer
    }

    fun UserDelete(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("UserDelete", options)
        return answer
    }
}