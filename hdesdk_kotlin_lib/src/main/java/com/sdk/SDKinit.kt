package com.sdk

import android.util.Log
import com.sdk.comment.Comment
import com.sdk.departments.Departments
import com.sdk.knowledgebase.KnowledgeBase
import com.sdk.request.RequestHttp
import com.sdk.tickets.Ticket
import com.sdk.user.User


/**
 * Class SDKInit
 */

class SDKinit(user_email: String, apikey: String, hde_url: String) {

    private val headers: Map<String, String>? = null
    var answer: String? = null

    /**
     * Generate a new Request object
     *
     * @param user_email email address for access
     * @param apikey API key of your HelpDeskEddy profile
     * @param hde_url URL of your HelpDeskEddy system
     */
    var request = RequestHttp(user_email, apikey, hde_url)


    /**
     * Create a new Ticket
     *
     * @param options API request options
     * @return API request answer
     */
    fun TicketCreate(
        options: Map<String?, String?>
    ): String? {
        answer = Ticket().TicketCreate(this.request, options)
        return answer
    }

    /**
     * Update Ticket data by ticket_id
     *
     * @param options API request options
     * @return API request answer
     */
    fun TicketUpdate(
        options: Map<String?, String?>
    ): String? {
        answer = Ticket().TicketUpdate(this.request, options)
        return answer
    }

    /**
     * Get Ticket data by ticket_id
     *
     * @param options API request options
     * @return API request answer
     */
    fun TicketGet(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketGet(this.request,options)
        return answer
    }

    /**
     * Get Tickets list
     *
     * @param options API request options
     * @return API request answer
     */
    fun TicketsGet(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketsGet(this.request, options)
        return answer
    }

    /**
     * Delete Ticket by ticket_id
     *
     * @param options API request options
     * @return API request answer
     */
    fun TicketDelete(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketDelete(this.request , options)
        return answer
    }

    /**
     * Get Ticket Answers history by ticket_id
     *
     * @param options API request options
     * @return API request answer
     */
    fun TicketAnswersGet(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketAnswersGet(this.request , options)
        return answer
    }

    /**
     * Add new Answer to Ticket by ticket_id
     *
     * @param options API request options
     * @return API request answer
     */
    fun TicketAnswerSet(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketAnswerSet(this.request , options)
        return answer
    }

    /**
     * Update Ticket Answer by ticket_id and answer id
     *
     * @param options API request options
     * @return API request answer
     */
    fun TicketAnswerUpdate(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketAnswerUpdate(this.request , options)
        return answer
    }

    /**
     * Delete Ticket Answer by ticket_id and answer id
     *
     * @param options API request options
     * @return API request answer
     */
    fun TicketAnswerDelete(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketAnswerDelete(this.request , options)
        return answer
    }

    /**
     * Get Ticket Statuses List
     *
     * @param options API request options
     * @return API request answer
     */
    fun TicketStatusesListGet(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketStatusesListGet(this.request , options)
        return answer
    }

    /**
     * Get Ticket Priorities List
     *
     * @param options API request options
     * @return API request answer
     */
    fun TicketPrioritiesListGet(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketPrioritiesListGet(this.request , options)
        return answer
    }

    /**
     * Get Ticket Types List
     *
     * @param options API request options
     * @return API request answer
     */
    fun TicketTypesListGet(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketTypesListGet(this.request , options)
        return answer
    }

    /**
     * Get Tickets Custom Fields List
     *
     * @param options API request options
     * @return API request answer
     */
    fun CustomFieldsListGet(options: Map<String?, String?>?): String? {
        answer = Ticket().CustomFieldsListGet(this.request , options)
        return answer
    }

    /**
     * Get Custom Field
     *
     * @param options API request options
     * @return API request answer
     */
    fun CustomFieldGet(options: Map<String?, String?>?): String? {
        answer = Ticket().CustomFieldGet(this.request , options)
        return answer
    }

    /**
     * Get Custom Field Options
     *
     * @param options API request options
     * @return API request answer
     */
    fun OptionsGet(options: Map<String?, String?>?): String? {
        answer = Ticket().OptionsGet(this.request , options)
        return answer
    }

    /**
     * Set Custom Field Options
     *
     * @param options API request options
     * @return API request answer
     */
    fun OptionsSet(options: Map<String?, String?>?): String? {
        answer = Ticket().OptionsSet(this.request , options)
        return answer
    }

    /**
     * Delete Custom Field Option by custom_field_id and option_id
     *
     * @param options API request options
     * @return API request answer
     */
    fun OptionsDelete(options: Map<String?, String?>?): String? {
        answer = Ticket().OptionsDelete(this.request , options)
        return answer
    }
    //------------------------------- /Tickets Part ---------------------------------

    //------------------------------- Comments Part ---------------------------------
    /**
     * Get Comments list by ticket_id
     *
     * @param options API request options
     * @return API request answer
     */
    fun CommentsGet(options: Map<String?, String?>?): String? {
        answer = Comment().CommentsGet(this.request , options)
        return answer
    }

    /**
     * Add new Comment to Ticket by ticket_id
     *
     * @param options API request options
     * @return API request answer
     */
    fun CommentCreate(options: Map<String?, String?>?): String? {
        answer = Comment().CommentCreate(this.request , options)
        return answer
    }

    /**
     * Update Comment data by ticket_id and comment id
     *
     * @param options API request options
     * @return API request answer
     */
    fun CommentUpdate(options: Map<String?, String?>?): String? {
        answer = Comment().CommentUpdate(this.request , options)
        return answer
    }

    /**
     * Delete Comment by ticket_id and comment id
     *
     * @param options API request options
     * @return API request answer
     */
    fun CommentDelete(options: Map<String?, String?>?): String? {
        answer = Comment().CommentDelete(this.request , options)
        return answer
    }
    //------------------------------- /Comments Part ---------------------------------

    //------------------------------- Users Part ---------------------------------
    /**
     * Get Users list
     *
     * @param options API request options
     * @return API request answer
     */
    fun UserListGet(options: Map<String?, String?>?): String? {
        answer = User().UserListGet(this.request , options)
        return answer
    }

    /**
     * Get User data by id
     *
     * @param options API request options
     * @return API request answer
     */
    fun UserGet(options: Map<String?, String?>?): String? {
        answer = User().UserGet(this.request , options)
        return answer
    }

    /**
     * Add new User
     *
     * @param options API request options
     * @return API request answer
    */
    fun UserCreate(options: Map<String?, String?>?): String? {
        answer = User().UserCreate(this.request , options)
        return answer
    }

    /**
     * Update User data by id
     *
     * @param options API request options
     * @return API request answer
     */
    fun UserUpdate(options: Map<String?, String?>?): String? {
        answer = User().UserUpdate(this.request , options)
        return answer
    }

    /**
     * Delete User data by id
     *
     * @param options API request options
     * @return API request answer
     */
    fun UserDelete(options: Map<String?, String?>?): String? {
        answer = User().UserDelete(this.request , options)
        return answer
    }
    //------------------------------- /Users Part ---------------------------------

    //------------------------------- Departments Part ----------------------------
    /**
     * Get Departments list
     *
     * @param options API request options
     * @return API request answer
     */
    fun DepartmentListGet(options: Map<String?, String?>?): String? {
        answer = Departments().DepartmentListGet(this.request , options)
        return answer
    }
    //------------------------------- /Departments Part ---------------------------

    //------------------------------- Knowledge Base Part ----------------------------
    /**
     * Get Knowledge Base Categories list
     *
     * @param options API request options
     * @return API request answer
     */
    fun CategoriesListGet(options: Map<String?, String?>?): String? {
        answer = KnowledgeBase().CategoriesListGet(this.request , options)
        return answer
    }

    /**
     * Get Knowledge Base Articles list
     *
     * @param options API request options
     * @return API request answer
     */
    fun ArticlesListGet(options: Map<String?, String?>?): String? {
        answer = KnowledgeBase().ArticlesListGet(this.request , options)
        return answer
    }
    //------------------------------- /Knowledge Base Part  ---------------------------
}