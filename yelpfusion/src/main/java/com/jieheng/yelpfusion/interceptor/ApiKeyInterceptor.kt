package com.jieheng.yelpfusion.interceptor

import okhttp3.Interceptor
import okhttp3.Interceptor.Chain
import okhttp3.Response

internal class ApiKeyInterceptor(private val apiKey: String) : Interceptor {

    override fun intercept(chain: Chain): Response {
        val request = chain.request().newBuilder()
            .header("Accept", "application/json")
            .header("Authorization", "bearer $apiKey")
            .build()
        return chain.proceed(request)
    }

}