package com.sdk.knowledgebase

import com.sdk.request.RequestHttp

/**
 * Knowledge Base request's class
 */

class KnowledgeBase() {

    var answer: String? = null

    /**
     * Get Knowledge Base Categories list
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun CategoriesListGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("CategoriesListGet", options)
        return answer
    }

    /**
     * Get Knowledge Base Articles list
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun ArticlesListGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("ArticlesListGet", options)
        return answer
    }
}