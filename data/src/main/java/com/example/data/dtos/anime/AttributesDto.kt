package com.example.data.dtos.anime

import com.example.domain.models.anime.Attributes
import com.google.gson.annotations.SerializedName

data class AttributesDto(
    @SerializedName("posterImage")
    val posterImage: PosterImageDto,
    @SerializedName("description")
    val description: String = "",
    @SerializedName("titles")
    val titles: TitlesDto,
)

fun AttributesDto.toDomain(): Attributes = Attributes(
    posterImage.toDomain(),
    description,
    titles.toDomain()
)