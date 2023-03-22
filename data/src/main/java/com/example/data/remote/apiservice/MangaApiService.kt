package com.example.data.remote.apiservice

import com.example.data.dtos.anime.main.DataItemDto
import com.example.data.dtos.anime.main.ResponseDto
import retrofit2.http.GET

interface MangaApiService {

    @GET("manga")
    suspend fun fetchManga(
    ): ResponseDto<DataItemDto>

}