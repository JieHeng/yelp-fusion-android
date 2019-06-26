package com.jieheng.yelpfusion.mapper

import com.jieheng.yelpfusion.request.AutoCompleteRequest

internal object AutoCompleteMapper : RequestMapper<AutoCompleteRequest> {

    override fun mapToQuery(request: AutoCompleteRequest) = HashMap<String, String>().apply {
        put("text", request.text)
        request.location?.let { put("location", it) }
        request.latitude?.let { put("latitude", it.toString()) }
        request.longitude?.let { put("longitude", it.toString()) }
    }

}