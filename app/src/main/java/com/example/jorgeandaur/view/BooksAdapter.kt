package com.example.jorgeandaur.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.jorgeandaur.databinding.BookItemListBinding
import com.example.jorgeandaur.model.pojos.Books

class BooksAdapter: RecyclerView.Adapter<BooksAdapter.BooksVH>() {

    private var booksList = listOf<Books>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksVH {
        val binding = BookItemListBinding.inflate(LayoutInflater.from(parent.context))

        return BooksVH(binding)

    }

    override fun onBindViewHolder(holder: BooksVH, position: Int) {
        val books = booksList[position]
        holder.bind(books)
       // holder.itemView.setOnClickListener()
    }

    override fun getItemCount(): Int {
        return booksList.size
    }

    fun update(pbooksList: List<Books>){
        booksList = pbooksList
        notifyDataSetChanged()}

    inner class BooksVH(val binding: BookItemListBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(books: Books) {
            binding.tvTitle
                .text = books.author}
        }
    }




