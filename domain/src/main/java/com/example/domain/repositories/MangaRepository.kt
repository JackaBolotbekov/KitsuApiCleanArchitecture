package com.example.domain.repositories

import com.example.domain.either.Either
import com.example.domain.models.anime.main.DataItem
import kotlinx.coroutines.flow.Flow

interface MangaRepository {

    fun fetchManga(): Flow<Either<String, List<DataItem>>>
}