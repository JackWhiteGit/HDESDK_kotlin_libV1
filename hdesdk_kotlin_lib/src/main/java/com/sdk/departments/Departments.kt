package com.sdk.departments

import com.sdk.request.RequestHttp

class Departments() {

    var answer: String? = null

    fun DepartmentListGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("DepartmentListGet", options)
        return answer
    }
}