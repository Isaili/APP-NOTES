package com.example.myapplicationnasa.src.features.country.presentation.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplicationnasa.src.features.country.domain.model.Country
import com.example.myapplicationnasa.src.features.country.domain.useCase.GetAllUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CountryViewModel(private val getAllUseCase: GetAllUseCase) : ViewModel() {
    private val _country = MutableStateFlow<List<Country>>(emptyList())
    val country: StateFlow<List<Country>> = _country

    private val _errorMessage = MutableStateFlow<String?>(null)
    val errorMessage: StateFlow<String?> = _errorMessage

    init {
        fetchCountry()
    }

    fun fetchCountry() {
        viewModelScope.launch {
            try {
                val countries = getAllUseCase()
                println("Datos de la API: $countries")
                _country.value = countries
                _errorMessage.value = null
            } catch (e: Exception) {
                _errorMessage.value = "Error al cargar los países: ${e.message}"
                println("Error en fetchCountry: ${e.message}")
            }
        }
    }
}