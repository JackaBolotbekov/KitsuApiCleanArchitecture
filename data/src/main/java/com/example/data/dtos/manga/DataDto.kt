package com.example.data.dtos.manga

import com.example.domain.models.anime.main.DataItem
import com.example.domain.models.manga.Data
import com.google.gson.annotations.SerializedName

data class DataDto(
    @SerializedName("data")
    val data: DataItem
)

fun DataDto.toDomain(): Data = Data(data)
