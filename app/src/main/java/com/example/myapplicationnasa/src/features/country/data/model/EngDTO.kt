package com.example.myapplicationnasa.src.features.country.data.model

import com.example.myapplicationnasa.src.features.country.domain.model.Eng

data class EngDTO (
    val official: String,
    val common: String

)
{
    fun toDomain()= Eng(
        official, common
    )
}