package com.example.presentation.models.anime

import com.example.domain.models.anime.Titles
import com.google.gson.annotations.SerializedName

data class TitlesUI(
    @SerializedName("en_jp")
    val enJp: String = ""
)

fun Titles.toUI(): TitlesUI = TitlesUI(
    enJp
)