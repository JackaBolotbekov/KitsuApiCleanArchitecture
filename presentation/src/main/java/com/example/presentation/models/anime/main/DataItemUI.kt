package com.example.presentation.models.anime.main

import com.example.domain.models.anime.main.DataItem
import com.example.presentation.models.anime.AttributesUI
import com.example.presentation.models.anime.toUI
import com.google.gson.annotations.SerializedName

data class DataItemUI(
    @SerializedName("attributes")
    val attributes: AttributesUI,
    @SerializedName("id")
    val id: String = "",
    @SerializedName("type")
    val type: String = ""
)

fun DataItem.toUI(): DataItemUI = DataItemUI(
    attributes.toUI(),
    id,
    type
)