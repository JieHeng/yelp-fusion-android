package com.jieheng.yelpfusion.model

import com.google.gson.annotations.SerializedName

data class BusinessDetails(
    @SerializedName("id") val id : String,
    @SerializedName("alias") val alias : String,
    @SerializedName("name") val name : String,
    @SerializedName("image_url") val image_url : String,
    @SerializedName("is_claimed") val is_claimed : Boolean,
    @SerializedName("is_closed") val is_closed : Boolean,
    @SerializedName("url") val url : String,
    @SerializedName("phone") val phone : String,
    @SerializedName("display_phone") val display_phone : String,
    @SerializedName("review_count") val review_count : Int,
    @SerializedName("categories") val categories : List<Category>,
    @SerializedName("rating") val rating : Double,
    @SerializedName("location") val location : Location,
    @SerializedName("coordinates") val coordinates : Coordinate,
    @SerializedName("photos") val photos : List<String>,
    @SerializedName("price") val price : String,
    @SerializedName("hours") val hours : List<Hour>,
    @SerializedName("transactions") val transactions : List<String>,
    @SerializedName("special_hours") val special_hours : List<SpecialHour>
)