package com.example.myapplicationnasa.src.features.country.data.repository

import com.example.myapplicationnasa.src.features.country.data.datasource.CountryService
import com.example.myapplicationnasa.src.features.country.domain.model.Country
import com.example.myapplicationnasa.src.features.country.domain.repository.CountryRespository

class CountryRepositoryImpl(private val api: CountryService): CountryRespository {
    override suspend fun GetCountries(): List<Country> {
        val response = api.getcountry()
        return  response.map { it.toDomain() }

    }

}