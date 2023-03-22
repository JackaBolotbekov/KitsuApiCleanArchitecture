package com.example.domain.usecase

import com.example.domain.either.Either
import com.example.domain.models.anime.main.DataItem
import com.example.domain.repositories.MangaRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FetchMangaUseCase @Inject constructor(private val repository: MangaRepository){

    operator fun invoke(): Flow<Either<String, List<DataItem>>> = repository.fetchManga()
}