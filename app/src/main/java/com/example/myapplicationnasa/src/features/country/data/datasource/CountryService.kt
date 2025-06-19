package com.example.myapplicationnasa.src.features.country.data.datasource

import com.example.myapplicationnasa.src.features.country.data.model.CountryDto
import retrofit2.http.GET

interface CountryService {
    @GET("/v3.1/all?fields=name,flags")
    suspend fun getcountry(): List<CountryDto>
}