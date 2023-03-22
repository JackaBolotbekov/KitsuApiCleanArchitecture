package com.example.domain.models.anime

data class Attributes(
    val posterImage: PosterImage,
    val description: String = "",
    val titles: Titles,
)