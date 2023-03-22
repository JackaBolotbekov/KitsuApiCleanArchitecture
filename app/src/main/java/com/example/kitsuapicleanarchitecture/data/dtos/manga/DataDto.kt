package com.example.kitsuapicleanarchitecture.data.dtos.manga

import com.example.kitsuapicleanarchitecture.domain.models.anime.main.DataItem
import com.example.kitsuapicleanarchitecture.domain.models.manga.Data
import com.google.gson.annotations.SerializedName

data class DataDto(
    @SerializedName("data")
    val data: DataItem
)

fun DataDto.toDomain(): Data = Data(data)
