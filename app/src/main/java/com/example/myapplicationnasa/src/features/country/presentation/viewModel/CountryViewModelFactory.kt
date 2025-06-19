package com.example.myapplicationnasa.src.features.country.presentation.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplicationnasa.src.features.country.domain.useCase.GetAllUseCase

class CountryViewModelFactory (
    private val getAllUseCase : GetAllUseCase
): ViewModelProvider.Factory{
    override  fun <T : ViewModel> create(modelClass: Class<T>):T{
        if(modelClass.isAssignableFrom(CountryViewModel::class.java)){
            return CountryViewModel(getAllUseCase) as T

        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}