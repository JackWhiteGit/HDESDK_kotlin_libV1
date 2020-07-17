package com.sdk.tickets

import com.sdk.request.RequestHttp

class Ticket() {
    var answer: String? = null


    fun TicketCreate(requesthttp: RequestHttp?, options: Map<String?, String?>): String? {
        answer = requesthttp?.Request("TicketCreate", options)
        return answer
    }

    fun TicketUpdate(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketUpdate", options)
        return answer
    }

    fun TicketGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketGet", options)
        return answer
    }

    fun TicketsGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketsGet", options)
        return answer
    }

    fun TicketDelete(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketDelete", options)
        return answer
    }

    fun TicketAnswersGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketAnswersGet", options)
        return answer
    }

    fun TicketAnswerSet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketAnswerSet", options)
        return answer
    }

    fun TicketAnswerUpdate(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketAnswerUpdate", options)
        return answer
    }

    fun TicketAnswerDelete(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketAnswerDelete", options)
        return answer
    }

    fun TicketStatusesListGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketStatusesListGet", options)
        return answer
    }

    fun TicketPrioritiesListGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketPrioritiesListGet", options)
        return answer
    }

    fun TicketTypesListGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketTypesListGet", options)
        return answer
    }

    fun CustomFieldsListGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("CustomFieldsListGet", options)
        return answer
    }

    fun CustomFieldGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("CustomFieldGet", options)
        return answer
    }

    fun OptionsGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("OptionsGet", options)
        return answer
    }

    fun OptionsSet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("OptionsSet", options)
        return answer
    }

    fun OptionsDelete(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("OptionsDelete", options)
        return answer
    }
}