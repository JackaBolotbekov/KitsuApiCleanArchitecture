package com.example.kitsuapicleanarchitecture.presentation.models.manga

import com.example.kitsuapicleanarchitecture.domain.models.anime.main.DataItem
import com.example.kitsuapicleanarchitecture.domain.models.manga.Data
import com.google.gson.annotations.SerializedName

data class DataUI(
    @SerializedName("data")
    val data: DataItem
)

fun Data.toUI(): DataUI = DataUI(
    data
)
