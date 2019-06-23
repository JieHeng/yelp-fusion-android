package com.jieheng.yelpfusion.mapper

internal interface RequestMapper<in V> {

    fun mapToQuery(request: V): HashMap<String, String>

}