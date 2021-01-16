package com.example.jorgeandaur.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val Base_Url = "https://my-json-server.typicode.com/Himuravidal/anchorBooks/"

class RetrofitClient{
    companion object{
        fun retrofitInstance():BookApi{
            val retrofit = Retrofit.Builder().baseUrl(Base_Url).addConverterFactory(GsonConverterFactory.create()
            ).build()

            return retrofit.create(BookApi::class.java)
        }
    }

}