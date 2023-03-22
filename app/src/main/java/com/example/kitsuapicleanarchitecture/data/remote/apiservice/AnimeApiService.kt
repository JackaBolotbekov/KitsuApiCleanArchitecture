package com.example.kitsuapicleanarchitecture.data.remote.apiservice

import com.example.kitsuapicleanarchitecture.data.dtos.anime.main.DataItemDto
import com.example.kitsuapicleanarchitecture.data.dtos.anime.main.ResponseDto
import retrofit2.http.GET

interface AnimeApiService {

    @GET("anime")
    suspend fun fetchAnime(
    ): ResponseDto<DataItemDto>
}