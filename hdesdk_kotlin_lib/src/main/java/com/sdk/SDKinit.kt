package com.sdk

import android.util.Log
import com.sdk.comment.Comment
import com.sdk.departments.Departments
import com.sdk.knowledgebase.KnowledgeBase
import com.sdk.request.RequestHttp
import com.sdk.tickets.Ticket
import com.sdk.user.User

class SDKinit(s: String, s1: String, s2: String) {

    private val headers: Map<String, String>? = null
    var answer: String? = null
    var request = RequestHttp(s, s1, s2)



    fun TicketCreate(
        options: Map<String?, String?>
    ): String? {
        answer = Ticket().TicketCreate(this.request, options)
        return answer
    }

    fun TicketUpdate(
        options: Map<String?, String?>
    ): String? {
        answer = Ticket().TicketUpdate(this.request, options)
        return answer
    }

    fun TicketGet(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketGet(this.request,options)
        return answer
    }

    fun TicketsGet(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketsGet(this.request, options)
        return answer
    }

    fun TicketDelete(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketDelete(this.request , options)
        return answer
    }

    fun TicketAnswersGet(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketAnswersGet(this.request , options)
        return answer
    }

    fun TicketAnswerSet(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketAnswerSet(this.request , options)
        return answer
    }

    fun TicketAnswerUpdate(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketAnswerUpdate(this.request , options)
        return answer
    }

    fun TicketAnswerDelete(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketAnswerDelete(this.request , options)
        return answer
    }

    fun TicketStatusesListGet(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketStatusesListGet(this.request , options)
        return answer
    }

    fun TicketPrioritiesListGet(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketPrioritiesListGet(this.request , options)
        return answer
    }

    fun TicketTypesListGet(options: Map<String?, String?>?): String? {
        answer = Ticket().TicketTypesListGet(this.request , options)
        return answer
    }

    fun CustomFieldsListGet(options: Map<String?, String?>?): String? {
        answer = Ticket().CustomFieldsListGet(this.request , options)
        return answer
    }

    fun CustomFieldGet(options: Map<String?, String?>?): String? {
        answer = Ticket().CustomFieldGet(this.request , options)
        return answer
    }

    fun OptionsGet(options: Map<String?, String?>?): String? {
        answer = Ticket().OptionsGet(this.request , options)
        return answer
    }

    fun OptionsSet(options: Map<String?, String?>?): String? {
        answer = Ticket().OptionsSet(this.request , options)
        return answer
    }

    fun OptionsDelete(options: Map<String?, String?>?): String? {
        answer = Ticket().OptionsDelete(this.request , options)
        return answer
    }
    //------------------------------- /Tickets Part ---------------------------------

    //------------------------------- Comments Part ---------------------------------
    fun CommentsGet(options: Map<String?, String?>?): String? {
        answer = Comment().CommentsGet(this.request , options)
        return answer
    }

    fun CommentCreate(options: Map<String?, String?>?): String? {
        answer = Comment().CommentCreate(this.request , options)
        return answer
    }

    fun CommentUpdate(options: Map<String?, String?>?): String? {
        answer = Comment().CommentUpdate(this.request , options)
        return answer
    }

    fun CommentDelete(options: Map<String?, String?>?): String? {
        answer = Comment().CommentDelete(this.request , options)
        return answer
    }
    //------------------------------- /Comments Part ---------------------------------

    //------------------------------- Users Part ---------------------------------
    fun UserListGet(options: Map<String?, String?>?): String? {
        answer = User().UserListGet(this.request , options)
        return answer
    }

    fun UserGet(options: Map<String?, String?>?): String? {
        answer = User().UserGet(this.request , options)
        return answer
    }

    fun UserCreate(options: Map<String?, String?>?): String? {
        answer = User().UserCreate(this.request , options)
        return answer
    }

    fun UserUpdate(options: Map<String?, String?>?): String? {
        answer = User().UserUpdate(this.request , options)
        return answer
    }

    fun UserDelete(options: Map<String?, String?>?): String? {
        answer = User().UserDelete(this.request , options)
        return answer
    }
    //------------------------------- /Users Part ---------------------------------

    //------------------------------- Departments Part ----------------------------
    fun DepartmentListGet(options: Map<String?, String?>?): String? {
        answer = Departments().DepartmentListGet(this.request , options)
        return answer
    }
    //------------------------------- /Departments Part ---------------------------

    //------------------------------- Knowledge Base Part ----------------------------
    fun CategoriesListGet(options: Map<String?, String?>?): String? {
        answer = KnowledgeBase().CategoriesListGet(this.request , options)
        return answer
    }

    fun ArticlesListGet(options: Map<String?, String?>?): String? {
        answer = KnowledgeBase().ArticlesListGet(this.request , options)
        return answer
    }
    //------------------------------- /Knowledge Base Part  ---------------------------
}