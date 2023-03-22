package com.example.kitsuapicleanarchitecture.data.dtos.anime.main

import com.example.kitsuapicleanarchitecture.domain.models.anime.main.Response
import com.google.gson.annotations.SerializedName

data class ResponseDto<T>(
    @SerializedName("data")
    val data: List<T>,
)

fun <T> ResponseDto<T>.toDomain(): Response<T> {
    return Response(
        data
    )
}