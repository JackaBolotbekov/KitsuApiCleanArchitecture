package com.example.domain.models

data class Response<T>(
    val data: List<T>,
)