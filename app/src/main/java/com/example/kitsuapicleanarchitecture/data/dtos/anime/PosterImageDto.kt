package com.example.kitsuapicleanarchitecture.data.dtos.anime

import com.example.kitsuapicleanarchitecture.domain.models.anime.PosterImage
import com.google.gson.annotations.SerializedName

data class PosterImageDto(
    @SerializedName("original")
    val original: String = "",
)

fun PosterImageDto.toDomain() : PosterImage = PosterImage(
    original
)