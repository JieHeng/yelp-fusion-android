package com.jieheng.yelpfusion.mapper

import com.jieheng.yelpfusion.request.BusinessSearchRequest

internal object BusinessSearchMapper : RequestMapper<BusinessSearchRequest> {

    override fun mapToQuery(request: BusinessSearchRequest) = HashMap<String, String>().apply {
        request.term?.let { put("term", it) }
        request.location?.let { put("location", it) }
        request.latitude?.let { put("latitude", it.toString()) }
        request.longitude?.let { put("longitude", it.toString()) }
        request.radius?.let { put("radius", it.toString()) }
        request.categories?.let { put("categories", it) }
        request.locale?.let { put("locale", it) }
        request.limit?.let { put("limit", it.toString()) }
        request.offset?.let { put("offset", it.toString()) }
        request.price?.let { put("price", it) }
        request.open_now?.let { put("open_now", it.toString()) }
        request.open_at?.let { put("open_at", it.toString()) }
        request.attributes?.let { put("attributes", it) }
    }

}