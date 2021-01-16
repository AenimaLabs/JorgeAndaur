package com.example.jorgeandaur.model.remote

import com.example.jorgeandaur.model.pojos.Books
import retrofit2.Response
import retrofit2.http.GET

interface BookApi {
    @GET("books")
    suspend fun getBooks(): Response<List<Books>>
}