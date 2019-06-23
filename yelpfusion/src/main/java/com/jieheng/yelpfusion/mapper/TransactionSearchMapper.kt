package com.jieheng.yelpfusion.mapper

import com.jieheng.yelpfusion.request.TransactionSearchRequest

internal object TransactionSearchMapper : RequestMapper<TransactionSearchRequest> {

    override fun mapToQuery(request: TransactionSearchRequest) = HashMap<String, String>().apply {
        request.location?.let { put("location", it) }
        request.latitude?.let { put("latitude", it.toString()) }
        request.longitude?.let { put("longitude", it.toString()) }
    }

}