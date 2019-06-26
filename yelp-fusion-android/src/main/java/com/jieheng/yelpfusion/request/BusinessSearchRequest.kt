package com.jieheng.yelpfusion.request

class BusinessSearchRequest(
    val term: String? = null,
    val location: String? = null,
    val latitude: Double? = null,
    val longitude: Double? = null,
    val radius: Int? = null,
    val categories: String? = null,
    val locale: String? = null,
    val limit: Int? = null,
    val offset: Int? = null,
    val price: String? = null,
    val open_now: Boolean? = null,
    val open_at: Int? = null,
    val attributes: String? = null
)