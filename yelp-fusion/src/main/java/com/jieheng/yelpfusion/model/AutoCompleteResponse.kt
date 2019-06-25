package com.jieheng.yelpfusion.model

import com.google.gson.annotations.SerializedName

data class AutoCompleteResponse (
    @SerializedName("terms") val terms : List<Term>,
    @SerializedName("businesses") val businesses : List<BusinessInfo>,
    @SerializedName("categories") val categories : List<Category>
)