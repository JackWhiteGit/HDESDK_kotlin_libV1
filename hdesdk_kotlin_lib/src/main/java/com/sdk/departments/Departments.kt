package com.sdk.departments

import com.sdk.request.RequestHttp

/**
 * Departments request's class
 */

class Departments() {

    var answer: String? = null

    /**
     * Get Departments list
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun DepartmentListGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("DepartmentListGet", options)
        return answer
    }
}