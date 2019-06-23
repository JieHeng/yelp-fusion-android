package com.jieheng.yelpfusion.api

import com.jieheng.yelpfusion.model.*
import io.reactivex.Single
import retrofit2.http.QueryMap
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

internal interface YelpFusionBusinessService {

    @GET(Urls.BUSINESS_SEARCH)
    fun getBusinessSearch(@QueryMap params: Map<String, String>): Single<BusinessSearchResponse>

    @GET(Urls.PHONE_SEARCH)
    fun getPhoneSearch(@Query("phone") phone: String, @Query("locale") locale: String? = null): Single<PhoneSearchResponse>

    @GET(Urls.TRANSACTION_SEARCH)
    fun getTransactionSearch(@Path("transaction_type") transactionType: String, @QueryMap params: Map<String, String>): Single<TransactionSearchResponse>

    @GET(Urls.BUSINESS_DETAILS)
    fun getBusinessDetails(@Path("id") id: String, @Query("locale") locale: String? = null): Single<BusinessDetails>

    @GET(Urls.BUSINESS_REVIEWS)
    fun getBusinessReviews(@Path("id") id: String, @Query("locale") locale: String? = null): Single<ReviewsResponse>

    @GET(Urls.AUTOCOMPLETE)
    fun getAutocomplete(@QueryMap params: Map<String, String>): Single<AutoCompleteResponse>

}