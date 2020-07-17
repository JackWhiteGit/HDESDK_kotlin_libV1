package com.sdk.knowledgebase

import com.sdk.request.RequestHttp

class KnowledgeBase() {

    var answer: String? = null

    fun CategoriesListGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("CategoriesListGet", options)
        return answer
    }

    fun ArticlesListGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("ArticlesListGet", options)
        return answer
    }
}