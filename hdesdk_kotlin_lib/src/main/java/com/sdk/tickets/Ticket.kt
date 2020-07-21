package com.sdk.tickets

import com.sdk.request.RequestHttp

class Ticket() {
    var answer: String? = null

    /**
     * Create a new Ticket
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun TicketCreate(requesthttp: RequestHttp?, options: Map<String?, String?>): String? {
        answer = requesthttp?.Request("TicketCreate", options)
        return answer
    }

    /**
     * Update Ticket data by ticket_id
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun TicketUpdate(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketUpdate", options)
        return answer
    }

    /**
     * Get Ticket data by ticket_id
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun TicketGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketGet", options)
        return answer
    }

    /**
     * Get Tickets list
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun TicketsGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketsGet", options)
        return answer
    }

    /**
     * Delete Ticket by ticket_id
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun TicketDelete(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketDelete", options)
        return answer
    }

    /**
     * Get Ticket Answers history by ticket_id
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun TicketAnswersGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketAnswersGet", options)
        return answer
    }

    /**
     * Add new Answer to Ticket by ticket_id
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun TicketAnswerSet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketAnswerSet", options)
        return answer
    }

    /**
     * Update Ticket Answer by ticket_id and answer id
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun TicketAnswerUpdate(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketAnswerUpdate", options)
        return answer
    }

    /**
     * Delete Ticket Answer by ticket_id and answer id
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun TicketAnswerDelete(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketAnswerDelete", options)
        return answer
    }

    /**
     * Get Ticket Statuses List
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun TicketStatusesListGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketStatusesListGet", options)
        return answer
    }

    /**
     * Get Ticket Priorities List
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun TicketPrioritiesListGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketPrioritiesListGet", options)
        return answer
    }

    /**
     * Get Ticket Types List
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun TicketTypesListGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("TicketTypesListGet", options)
        return answer
    }

    /**
     * Get Tickets Custom Fields List
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun CustomFieldsListGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("CustomFieldsListGet", options)
        return answer
    }

    /**
     * Get Custom Field
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun CustomFieldGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("CustomFieldGet", options)
        return answer
    }

    /**
     * Get Custom Field Options
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun OptionsGet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("OptionsGet", options)
        return answer
    }

    /**
     * Set Custom Field Options
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun OptionsSet(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("OptionsSet", options)
        return answer
    }

    /**
     * Delete Custom Field Option by custom_field_id and option_id
     *
     * @param requesthttp Request object
     * @param options API request options
     * @return API request answer
     */
    fun OptionsDelete(requesthttp: RequestHttp?, options: Map<String?, String?>?): String? {
        answer = requesthttp!!.Request("OptionsDelete", options)
        return answer
    }
}