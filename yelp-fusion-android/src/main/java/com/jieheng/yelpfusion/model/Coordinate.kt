package com.jieheng.yelpfusion.model

import com.google.gson.annotations.SerializedName

data class Coordinate (
    @SerializedName("latitude") val latitude : Double,
    @SerializedName("longitude") val longitude : Double
)