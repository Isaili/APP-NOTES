package com.example.myapplicationnasa.src.features.country.domain.repository

import com.example.myapplicationnasa.src.features.country.domain.model.Country

interface CountryRespository {
    suspend fun GetCountries():List<Country>

}
