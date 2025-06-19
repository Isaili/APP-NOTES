package com.example.myapplicationnasa.src.features.country.data.model

import com.example.myapplicationnasa.src.features.country.domain.model.Flags

data class FlagsDto(
    val png : String,
    val svg : String,
    val alt: String
)

{ fun toDomain()= Flags(
    png,svg,alt
    )
}