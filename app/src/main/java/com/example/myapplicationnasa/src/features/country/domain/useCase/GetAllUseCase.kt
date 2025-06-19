package com.example.myapplicationnasa.src.features.country.domain.useCase

import com.example.myapplicationnasa.src.features.country.domain.model.Country
import com.example.myapplicationnasa.src.features.country.domain.repository.CountryRespository

class GetAllUseCase (private  val respository: CountryRespository){
    suspend operator fun invoke():List<Country>{
        return respository.GetCountries()
    }
}