package com.sdk.request

import org.json.JSONObject
import java.io.UnsupportedEncodingException
import java.net.URLEncoder
import java.nio.charset.StandardCharsets
import java.util.*

class RequestPresets {

    fun RequestOptions(
        request_type: String,
        options_arr: Map<String?, String?>?
    ): Map<String, String> {
        var id: String? = ""
        var ticket_id: String? = ""
        var custom_field_id: String? = ""
        var option_id: String? = ""
        if (options_arr?.get("id") != null)  id = options_arr.get("id")
        if (options_arr?.get("ticket_id") != null) ticket_id = options_arr.get("ticket_id")
        if (options_arr?.get("custom_field_id") != null) custom_field_id = options_arr.get("custom_field_id")
        if (options_arr?.get("option_id") != null) option_id = options_arr.get("option_id")
        var temp = emptyMap<String, String>()
        when (request_type) {
            "DepartmentListGet" -> {
                temp = mapOf(
                    "method" to "GET",
                    "url" to "/departments/",
                    "content_type" to "",
                    "url_part" to ""
                )
            }
            "TicketCreate" -> {
                temp = mapOf(
                    "method" to "POST",
                    "url" to "/tickets/",
                    "content_type" to "application/x-www-form-urlencoded",
                    "url_part" to ""
                )
            }
            "TicketUpdate" -> {
                temp = mapOf(
                    "method" to "PUT",
                    "url" to "/tickets/$id",
                    "content_type" to "application/json",
                    "url_part" to "{{id}}"
                )
            }
            "TicketGet" -> {
                temp = mapOf(
                    "method" to "GET",
                    "url" to "/tickets/$id",
                    "content_type" to "",
                    "url_part" to "{{id}}"
                )
            }
            "TicketsGet" -> {
                temp = mapOf(
                    "method" to "GET",
                    "url" to "/tickets/",
                    "content_type" to "",
                    "url_part" to ""
                )
            }
            "TicketDelete" -> {
                temp = mapOf(
                    "method" to "DELETE",
                    "url" to "/tickets/$id",
                    "content_type" to "application/x-www-form-urlencoded",
                    "url_part" to "{{id}}"
                )
            }
            "TicketAnswersGet" -> {
                temp = mapOf(
                    "method" to "GET",
                    "url" to "/tickets/$ticket_id/posts/",
                    "content_type" to "",
                    "url_part" to "{{ticket_id}}"
                )
            }
            "TicketAnswerSet" -> {
                temp = mapOf(
                    "method" to "POST",
                    "url" to "/tickets/$ticket_id/posts/",
                    "content_type" to "application/x-www-form-urlencoded",
                    "url_part" to "{{ticket_id}}"
                )

            }
            "TicketAnswerUpdate" -> {
                temp = mapOf(
                    "method" to "PUT",
                    "url" to "/tickets/$ticket_id/posts/$id",
                    "content_type" to "application/x-www-form-urlencoded",
                    "url_part" to "{{ticket_id}}{{id}}"
                )

            }
            "TicketAnswerDelete" -> {
                temp = mapOf(
                    "method" to "DELETE",
                    "url" to "/tickets/$ticket_id/posts/$id",
                    "content_type" to "application/x-www-form-urlencoded",
                    "url_part" to "{{ticket_id}}{{id}}"
                )
            }
            "CommentsGet" -> {
                temp = mapOf(
                    "method" to "GET",
                    "url" to "/tickets/$ticket_id/comments/",
                    "content_type" to "",
                    "url_part" to "{{ticket_id}}"
                )
            }
            "CommentCreate" -> {
                temp = mapOf(
                    "method" to "POST",
                    "url" to "/tickets/$ticket_id/comments/",
                    "content_type" to "application/x-www-form-urlencoded",
                    "url_part" to "{{ticket_id}}{{id}}"
                )
            }
            "CommentUpdate" -> {
                temp = mapOf(
                    "method" to "PUT",
                    "url" to "/tickets/$ticket_id/comments/$id",
                    "content_type" to "application/x-www-form-urlencoded",
                    "url_part" to "{{ticket_id}}{{id}}"
                )
            }
            "CommentDelete" -> {
                temp = mapOf(
                    "method" to "DELETE",
                    "url" to "/tickets/$ticket_id/comments/$id",
                    "content_type" to "",
                    "url_part" to "{{ticket_id}}{{id}}"
                )
            }
            "UserListGet" -> {
                temp = mapOf(
                    "method" to "GET",
                    "url" to "/users/",
                    "content_type" to "",
                    "url_part" to ""
                )
            }
            "UserGet" -> {
                temp = mapOf(
                    "method" to "GET",
                    "url" to "/users/$id",
                    "content_type" to "",
                    "url_part" to "{{id}}"
                )
            }
            "UserCreate" -> {
                temp = mapOf(
                    "method" to "POST",
                    "url" to "/users/",
                    "content_type" to "application/x-www-form-urlencoded",
                    "url_part" to ""
                )
            }
            "UserUpdate" -> {
                temp = mapOf(
                    "method" to "PUT",
                    "url" to "/users/$id",
                    "content_type" to "application/json",
                    "url_part" to "{{id}}"
                )
            }
            "UserDelete" -> {
                temp = mapOf(
                    "method" to "DELETE",
                    "url" to "/users/$id",
                    "content_type" to "",
                    "url_part" to "{{id}}"
                )
            }
            "CategoriesListGet" -> {
                temp = mapOf(
                    "method" to "GET",
                    "url" to "/knowledge_base/categories/",
                    "content_type" to "",
                    "url_part" to ""
                )
            }
            "ArticlesListGet" -> {
                temp = mapOf(
                    "method" to "GET",
                    "url" to "/knowledge_base/articles/",
                    "content_type" to "",
                    "url_part" to ""
                )
            }
            "TicketStatusesListGet" -> {
                temp = mapOf(
                    "method" to "GET",
                    "url" to "/statuses/",
                    "content_type" to "",
                    "url_part" to ""
                )
            }
            "TicketPrioritiesListGet" -> {
                temp = mapOf(
                    "method" to "GET",
                    "url" to "/priorities/",
                    "content_type" to "",
                    "url_part" to ""

                )
            }
            "TicketTypesListGet" -> {
                temp = mapOf(
                    "method" to "GET",
                    "url" to "/types/",
                    "content_type" to "",
                    "url_part" to ""

                )
            }
            "CustomFieldsListGet" -> {
                temp = mapOf(
                    "method" to "GET",
                    "url" to "/custom_fields/",
                    "content_type" to "",
                    "url_part" to ""

                )
            }
            "CustomFieldGet" -> {
                temp = mapOf(
                    "method" to "GET",
                    "url" to "/custom_fields/$custom_field_id",
                    "content_type" to "",
                    "url_part" to "{{custom_field_id}}"

                )
            }
            "OptionsGet" -> {
                temp = mapOf(
                    "method" to "GET",
                    "url" to "/custom_fields/$custom_field_id/options/",
                    "content_type" to "",
                    "url_part" to "{{custom_field_id}}"

                )
            }
            "OptionsSet" -> {
                temp = mapOf(
                    "method" to "POST",
                    "url" to "/custom_fields/$custom_field_id/options/",
                    "content_type" to "application/json",
                    "url_part" to "{{custom_field_id}}"

                )
            }
            "OptionsDelete" -> {
                temp = mapOf(
                    "method" to "DELETE",
                    "url" to "/custom_fields/$custom_field_id/options/$option_id",
                    "content_type" to "",
                    "url_part" to "{{custom_field_id}}{{option_id}}"

                )
            }
        }
        return temp
    }

    fun RequestData(
        request_type: String,
        options_arr: Map<String?, String?>?
    ): String? {
        val requerstData = StringBuilder()
        val requestoptions =
            RequestOptions(request_type, options_arr)
        when (Objects.requireNonNull(requestoptions["method"])) {
            "GET" -> {
                requerstData.append("?")
                if (options_arr != null) {
                    for ((key, value) in options_arr) {
                        if (!Objects.requireNonNull(requestoptions["url_part"])
                                ?.contains("{{$key}}")!!
                        ) {
                            requerstData.append(key).append("=").append(encodeValue(value))
                                .append("&")
                        }
                    }
                }
                requerstData.deleteCharAt(requerstData.length - 1)
            }
            "POST", "PUT" -> {
                if (requestoptions["content_type"] == "application/x-www-form-urlencoded") {
                if (options_arr != null) {
                    for ((key, value) in options_arr) {
                        if (!Objects.requireNonNull(requestoptions["url_part"])
                                ?.contains("{{$key}}")!!
                        ) {
                            requerstData.append(key).append("=").append(encodeValue(value))
                                .append("&")
                        }
                    }
                }
                requerstData.deleteCharAt(requerstData.length - 1)
            }else if(requestoptions["content_type"] == "application/json"){
                    if (options_arr != null) {
                        val moptions_arr : MutableMap<String?, String?> = options_arr.toMutableMap()
                        requerstData.append(JSONObject(moptions_arr as Map<String?, String?>).toString())
                    }
                }
            }
        }
        return requerstData.toString()
    }

    private fun encodeValue(value: String?): String? {
        return try {
            URLEncoder.encode(
                value,
                StandardCharsets.UTF_8.toString()
            )
        } catch (ex: UnsupportedEncodingException) {
            throw RuntimeException(ex.cause)
        }
    }

    fun removeLastCharacter(str: String?): String? {
        var result: String? = null
        if (str != null && str.length > 0) {
            result = str.substring(0, str.length - 1)
        }
        return result
    }
}