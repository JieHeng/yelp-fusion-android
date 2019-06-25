package com.jieheng.yelpfusion.request

class TransactionSearchRequest(
    val transactionType: String = "delivery",
    val location: String? = null,
    val latitude: Double? = null,
    val longitude: Double? = null
)