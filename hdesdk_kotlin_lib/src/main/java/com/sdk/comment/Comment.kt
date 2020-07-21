package com.sdk.comment

import com.sdk.request.RequestHttp

/**
 * Comments request's class
 */

class Comment() {
    var answer: String? = null

    /**
     * Get Comments list by ticket_id
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun CommentsGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("CommentsGet", options)
        return answer
    }

    /**
     * Add new Comment to Ticket by ticket_id
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun CommentCreate(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("CommentCreate", options)
        return answer
    }

    /**
     * Update Comment data by ticket_id and comment id
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun CommentUpdate(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("CommentUpdate", options)
        return answer
    }

    /**
     * Delete Comment by ticket_id and comment id
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun CommentDelete(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp?.Request("CommentDelete", options)
        return answer
    }
}