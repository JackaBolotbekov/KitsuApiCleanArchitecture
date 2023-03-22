package com.example.kitsuapicleanarchitecture.data.repositories

import com.example.kitsuapicleanarchitecture.data.dtos.anime.main.toDomain
import com.example.kitsuapicleanarchitecture.data.remote.apiservice.MangaApiService
import com.example.kitsuapicleanarchitecture.domain.either.Either
import com.example.kitsuapicleanarchitecture.domain.models.anime.main.DataItem
import com.example.kitsuapicleanarchitecture.domain.repositories.MangaRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class MangaRepositoryImpl @Inject constructor(private val service: MangaApiService) :
    MangaRepository {

    override fun fetchManga() = flow<Either<String, List<DataItem>>> {
        emit(Either.Right(service.fetchManga().data.map {
            it.toDomain()
        }))
    }.flowOn(Dispatchers.IO).catch {
        emit(Either.Left(it.localizedMessage ?: "Error Occurred!!"))
    }
}