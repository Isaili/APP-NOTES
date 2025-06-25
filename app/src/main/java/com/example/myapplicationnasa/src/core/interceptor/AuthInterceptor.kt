package com.example.myapplicationnasa.src.core.interceptor

import okhttp3.Interceptor
import okhttp3.Response
import java.security.AuthProvider

class AuthInterceptor (
    private val tokenProvider: () -> String
) : Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response{
        val request = chain.request().newBuilder()
            .addHeader("Authorization","Bearer ${tokenProvider()}")
            .build()

        return chain.proceed(request)
    }
}