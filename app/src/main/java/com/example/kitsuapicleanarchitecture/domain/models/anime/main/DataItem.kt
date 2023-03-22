package com.example.kitsuapicleanarchitecture.domain.models.anime.main

import com.example.kitsuapicleanarchitecture.domain.models.anime.Attributes

data class DataItem(
    val attributes: Attributes,
    val id: String = "",
    val type: String = ""
)