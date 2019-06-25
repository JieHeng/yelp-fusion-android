package com.jieheng.yelpfusion.model

import com.google.gson.annotations.SerializedName

data class BusinessInfo (
    @SerializedName("rating") val rating : Double,
    @SerializedName("price") val price : String,
    @SerializedName("phone") val phone : String,
    @SerializedName("id") val id : String,
    @SerializedName("alias") val alias : String,
    @SerializedName("categories") val categories : List<Category>,
    @SerializedName("review_count") val review_count : Int,
    @SerializedName("name") val name : String,
    @SerializedName("url") val url : String,
    @SerializedName("coordinates") val coordinates : Coordinate,
    @SerializedName("image_url") val image_url : String,
    @SerializedName("is_closed") val is_closed : Boolean,
    @SerializedName("location") val location : Location,
    @SerializedName("transactions") val transactions : List<String>
)