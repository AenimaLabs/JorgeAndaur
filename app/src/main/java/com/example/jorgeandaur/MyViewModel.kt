package com.example.jorgeandaur

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jorgeandaur.model.Repo
import com.example.jorgeandaur.model.pojos.Books
import kotlinx.coroutines.launch
import timber.log.Timber

class MyViewModel : ViewModel(){

    private val repository = Repo()

    private val books = repository.books

    init {
        Timber.d("cargando información de libros")
        viewModelScope.launch {
        repository.getBooks()}
    }


    fun books(): LiveData<List<Books>> = books


}