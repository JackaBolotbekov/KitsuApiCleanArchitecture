package com.example.kitsuapicleanarchitecture.di

import com.example.kitsuapicleanarchitecture.data.repositories.AnimeRepositoryImpl
import com.example.kitsuapicleanarchitecture.data.repositories.MangaRepositoryImpl
import com.example.kitsuapicleanarchitecture.domain.repositories.AnimeRepository
import com.example.kitsuapicleanarchitecture.domain.repositories.MangaRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Binds
    fun bindAnimeRepository(repositoryImpl: AnimeRepositoryImpl): AnimeRepository

    @Binds
    fun bindMangaRepository(repositoryImpl: MangaRepositoryImpl): MangaRepository
}