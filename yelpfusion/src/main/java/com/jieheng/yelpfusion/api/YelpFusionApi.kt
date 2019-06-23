package com.jieheng.yelpfusion.api

import com.jieheng.yelpfusion.interceptor.ApiKeyInterceptor
import com.jieheng.yelpfusion.mapper.AutoCompleteMapper
import com.jieheng.yelpfusion.mapper.BusinessSearchMapper
import com.jieheng.yelpfusion.mapper.TransactionSearchMapper
import com.jieheng.yelpfusion.request.AutoCompleteRequest
import com.jieheng.yelpfusion.request.BusinessSearchRequest
import com.jieheng.yelpfusion.request.TransactionSearchRequest
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class YelpFusionApi private constructor(apiKey: String) {

    private val yelpFusionBusinessService = Retrofit.Builder()
        .baseUrl(Urls.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .client(
            OkHttpClient.Builder()
                .addInterceptor(ApiKeyInterceptor(apiKey))
                .addInterceptor(HttpLoggingInterceptor().apply { setLevel(HttpLoggingInterceptor.Level.BODY) })
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build()
        )
        .build()
        .create(YelpFusionBusinessService::class.java)

    fun getBusinessSearch(request: BusinessSearchRequest) = yelpFusionBusinessService.getBusinessSearch(BusinessSearchMapper.mapToQuery(request))

    fun getPhoneSearch(phone: String, locale: String? = null) = yelpFusionBusinessService.getPhoneSearch(phone, locale)

    fun getTransactionSearch(request: TransactionSearchRequest) = yelpFusionBusinessService.getTransactionSearch(request.transactionType, TransactionSearchMapper.mapToQuery(request))

    fun getBusinessDetails(id: String, locale: String? = null) = yelpFusionBusinessService.getBusinessDetails(id, locale)

    fun getBusinessReviews(id: String, locale: String? = null) = yelpFusionBusinessService.getBusinessReviews(id, locale)

    fun getAutocomplete(request: AutoCompleteRequest) = yelpFusionBusinessService.getAutocomplete(AutoCompleteMapper.mapToQuery(request))

    companion object {

        @Volatile private var INSTANCE: YelpFusionApi? = null

        fun init(apiKey: String) {
            if(INSTANCE == null) {
                synchronized(this) {
                    if(INSTANCE == null) {
                        INSTANCE = YelpFusionApi(apiKey)
                    }
                }
            }
        }

        fun get() = INSTANCE ?: throw IllegalStateException("Please init YelpFusionApi with API key")

    }

}