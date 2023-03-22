package com.example.kitsuapicleanarchitecture.presentation.models.anime

import com.example.kitsuapicleanarchitecture.domain.models.anime.PosterImage
import com.google.gson.annotations.SerializedName

data class PosterImageUI(
    @SerializedName("original")
    val original: String = "",
)

fun PosterImage.toUI(): PosterImageUI = PosterImageUI(
    original
)