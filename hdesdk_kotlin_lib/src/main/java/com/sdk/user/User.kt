package com.sdk.user

import com.sdk.request.RequestHttp

/**
 * User request's class
 */

class User() {
    var answer: String? = null

    /**
     * Get Users list
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun UserListGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("UserListGet", options)
        return answer
    }

    /**
     * Get User data by id
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun UserGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("UserGet", options)
        return answer
    }

    /**
     * Add new User
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun UserCreate(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("UserCreate", options)
        return answer
    }

    /**
     * Update User data by id
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun UserUpdate(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("UserUpdate", options)
        return answer
    }

    /**
     * Delete User data by id
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun UserDelete(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("UserDelete", options)
        return answer
    }
}