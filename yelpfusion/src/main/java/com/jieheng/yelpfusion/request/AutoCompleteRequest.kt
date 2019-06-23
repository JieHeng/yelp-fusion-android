package com.jieheng.yelpfusion.request

class AutoCompleteRequest(
    val text: String,
    val location: String? = null,
    val latitude: Double? = null,
    val longitude: Double? = null
)