package com.example.data.dtos.anime.main

import com.example.domain.models.anime.main.DataItem
import com.example.data.dtos.anime.AttributesDto
import com.example.data.dtos.anime.toDomain
import com.google.gson.annotations.SerializedName

data class DataItemDto(
    @SerializedName("attributes")
    val attributes: AttributesDto,
    @SerializedName("id")
    val id: String = "",
    @SerializedName("type")
    val type: String = ""
)
fun DataItemDto.toDomain() : DataItem = DataItem(
    attributes.toDomain(),
    id,
    type
)
