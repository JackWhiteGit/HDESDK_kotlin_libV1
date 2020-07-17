package com.sdk.comment

import com.sdk.request.RequestHttp

class Comment() {
    var answer: String? = null

    fun CommentsGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("CommentsGet", options)
        return answer
    }

    fun CommentCreate(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("CommentCreate", options)
        return answer
    }

    fun CommentUpdate(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("CommentUpdate", options)
        return answer
    }

    fun CommentDelete(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("CommentDelete", options)
        return answer
    }
}