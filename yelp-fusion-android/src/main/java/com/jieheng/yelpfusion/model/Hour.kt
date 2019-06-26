package com.jieheng.yelpfusion.model

import com.google.gson.annotations.SerializedName

data class Hour (
    @SerializedName("open") val open : List<Open>,
    @SerializedName("hours_type") val hoursType : String,
    @SerializedName("is_open_now") val isOpenNow : Boolean
)