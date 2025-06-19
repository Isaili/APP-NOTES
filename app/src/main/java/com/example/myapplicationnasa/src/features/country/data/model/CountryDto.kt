package com.example.myapplicationnasa.src.features.country.data.model

import com.example.myapplicationnasa.src.features.country.domain.model.Country


data class CountryDto(
    val flags: FlagsDto,
    val name: NameDto,

)


{
    fun toDomain() = Country(
        flags = flags.toDomain(),
        name = name.toDomain(),

    )

}