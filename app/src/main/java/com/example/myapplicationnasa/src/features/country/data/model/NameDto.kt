package com.example.myapplicationnasa.src.features.country.data.model

import com.example.myapplicationnasa.src.features.country.domain.model.Name

data class NameDto(
    val common: String,
    val official: String
)

{
    fun toDomain()= Name(
        common, official
    )
}