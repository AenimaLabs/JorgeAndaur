package com.example.jorgeandaur.model

import androidx.lifecycle.MutableLiveData
import com.example.jorgeandaur.model.pojos.Books
import com.example.jorgeandaur.model.remote.RetrofitClient
import timber.log.Timber

class Repo{

    val books : MutableLiveData<List<Books>> = MutableLiveData()

    suspend fun getBooks(){
        Timber.d("getBooks")
        val response = RetrofitClient.retrofitInstance().getBooks()

        if (response.isSuccessful){
            response.body()?.let { Timber.d("tenemos  ${it.size} libros")
            books.value= it}

        }
        else {
            Timber.d("${response.errorBody()}")
        }
    }
}