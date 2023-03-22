package com.example.kitsuapicleanarchitecture.domain.repositories

import com.example.kitsuapicleanarchitecture.domain.either.Either
import com.example.kitsuapicleanarchitecture.domain.models.anime.main.DataItem
import kotlinx.coroutines.flow.Flow

interface MangaRepository {

    fun fetchManga(): Flow<Either<String, List<DataItem>>>
}