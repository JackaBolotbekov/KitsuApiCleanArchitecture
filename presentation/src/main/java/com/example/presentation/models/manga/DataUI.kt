package com.example.presentation.models.manga

import com.example.domain.models.anime.main.DataItem
import com.example.domain.models.manga.Data
import com.google.gson.annotations.SerializedName

data class DataUI(
    @SerializedName("data")
    val data: DataItem
)

fun Data.toUI(): DataUI = DataUI(
    data
)
