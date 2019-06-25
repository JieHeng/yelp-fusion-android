package com.jieheng.yelpfusion.model

import com.google.gson.annotations.SerializedName

data class Open (
    @SerializedName("is_overnight") val isOvernight : Boolean,
    @SerializedName("start") val start : Int,
    @SerializedName("end") val end : Int,
    @SerializedName("day") val day : Int
)