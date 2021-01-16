package com.example.jorgeandaur.model.db

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.jorgeandaur.model.pojos.DetailBooks
import timber.log.Timber

@Entity (tableName = "books")
data class BooksEntity (val id: Int,
                        val author: String,
                        val country: String,
                        val imageLink: String,
                        val language: String,
                        val title: String)

@Entity(tableName = "books_detail")
data class BooksDetail (val author: String,
                        val country: String,
                        val delivery: Boolean,
                        val id: Int,
                        val imageLink: String,
                        val language: String,
                        val lastPrice: Int,
                        val link: String,
                        val pages: Int,
                        val price: Int,
                        val title: String,
                        val year: Int)

@Dao
interface BooksDao{
    @Insert
    suspend fun insert(books: List<BooksEntity>)

    @Query("SELECT * FROM books")
    fun getBooks(): LiveData<List<BooksEntity>>

    @Insert
    suspend fun insert(country: DetailBooks)

    @Query("SELECT * FROM books_detail WHERE title=:code")
    fun getCountry(code: String): LiveData<BooksDetail>
}

@Database(entities = [BooksEntity::class, BooksDetail::class], version = 1)
abstract class BookDatabase: RoomDatabase() {
    abstract fun bookDao(): BooksDao
}


class BookApplication : Application() {
    companion object {
        var bookDatabase: BookDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()
        Timber.d("onCreate de application")
        bookDatabase =
            Room.databaseBuilder(this, BookDatabase::class.java, "countries_database").build()
    }
}