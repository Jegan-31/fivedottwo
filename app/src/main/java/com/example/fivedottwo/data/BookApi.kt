package com.example.fivedottwo.data

import retrofit2.http.GET

interface BookApi {
    @GET("books")
    suspend fun getAllbooks():List<AllBooks>
}