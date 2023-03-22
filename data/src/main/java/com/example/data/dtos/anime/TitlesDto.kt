package com.example.data.dtos.anime

import com.example.domain.models.anime.Titles
import com.google.gson.annotations.SerializedName

data class TitlesDto(
    @SerializedName("en_jp")
    val enJp: String = ""
)

fun TitlesDto.toDomain(): Titles = Titles(enJp)