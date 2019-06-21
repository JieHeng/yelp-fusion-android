package com.jieheng.yelpfusion.model

import com.google.gson.annotations.SerializedName

data class BusinessSearchResponse (
    @SerializedName("total") val total : Int,
    @SerializedName("businesses") val businesses : List<BusinessInfo>,
    @SerializedName("region") val region : Region
)