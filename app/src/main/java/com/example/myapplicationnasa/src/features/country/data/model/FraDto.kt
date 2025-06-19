package com.example.myapplicationnasa.src.features.country.data.model

import com.example.myapplicationnasa.src.features.country.domain.model.Fra

data class FraDto(
    val official: String,
    val common: String
)

{
    fun toDomain()= Fra(
    official= official,
        common= common
    )
}