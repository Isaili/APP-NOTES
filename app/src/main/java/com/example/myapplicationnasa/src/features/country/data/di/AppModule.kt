package com.example.myapplicationnasa.src.features.country.data.di

import com.example.myapplicationnasa.src.core.network.RetrofitHelper
import com.example.myapplicationnasa.src.features.country.data.datasource.CountryService
import com.example.myapplicationnasa.src.features.country.data.repository.CountryRepositoryImpl
import com.example.myapplicationnasa.src.features.country.domain.repository.CountryRespository
import com.example.myapplicationnasa.src.features.country.domain.useCase.GetAllUseCase

object AppModule {
    private val api: CountryService = RetrofitHelper.retrofit.create(CountryService::class.java)

    private val repository: CountryRespository = CountryRepositoryImpl(api)

    val getCountriesUseCase = GetAllUseCase(repository)
}