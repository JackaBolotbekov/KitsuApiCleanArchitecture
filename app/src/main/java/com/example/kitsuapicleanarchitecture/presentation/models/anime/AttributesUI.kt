package com.example.kitsuapicleanarchitecture.presentation.models.anime

import com.example.kitsuapicleanarchitecture.domain.models.anime.Attributes
import com.example.kitsuapicleanarchitecture.domain.models.anime.Titles
import com.google.gson.annotations.SerializedName

data class AttributesUI(
    @SerializedName("posterImage")
    val posterImage: PosterImageUI,
    @SerializedName("description")
    val description: String = "",
    @SerializedName("titles")
    val titles: Titles,
)

fun Attributes.toUI(): AttributesUI = AttributesUI(
    posterImage.toUI(),
    description,
    titles
)