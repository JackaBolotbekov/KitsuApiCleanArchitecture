package com.example.presentation.models.anime

import com.example.domain.models.anime.PosterImage
import com.google.gson.annotations.SerializedName

data class PosterImageUI(
    @SerializedName("original")
    val original: String = "",
)

fun PosterImage.toUI(): PosterImageUI = PosterImageUI(
    original
)