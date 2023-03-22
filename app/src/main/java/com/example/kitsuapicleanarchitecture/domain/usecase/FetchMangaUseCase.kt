package com.example.kitsuapicleanarchitecture.domain.usecase

import com.example.kitsuapicleanarchitecture.domain.either.Either
import com.example.kitsuapicleanarchitecture.domain.models.anime.main.DataItem
import com.example.kitsuapicleanarchitecture.domain.repositories.AnimeRepository
import com.example.kitsuapicleanarchitecture.domain.repositories.MangaRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FetchMangaUseCase @Inject constructor(private val repository: MangaRepository){

    operator fun invoke(): Flow<Either<String, List<DataItem>>> = repository.fetchManga()
}