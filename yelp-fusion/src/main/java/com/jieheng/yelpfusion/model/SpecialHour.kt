package com.jieheng.yelpfusion.model

import com.google.gson.annotations.SerializedName

data class SpecialHour (
    @SerializedName("date") val date : String,
    @SerializedName("is_closed") val isClosed : String,
    @SerializedName("start") val start : Int,
    @SerializedName("end") val end : Int,
    @SerializedName("is_overnight") val isOvernight : Boolean
)