package com.example.jorgeandaur.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jorgeandaur.MyViewModel
import com.example.jorgeandaur.R
import com.example.jorgeandaur.databinding.FragmentListingBinding
import com.example.jorgeandaur.model.pojos.Books

class ListingFragment : Fragment() {

    private lateinit var binding : FragmentListingBinding

    private val vm: MyViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListingBinding.inflate(layoutInflater)

        binding.rvBookList.layoutManager = LinearLayoutManager(context)


        val adapter = BooksAdapter()
        binding.rvBookList.adapter = adapter


        vm.books().observe(viewLifecycleOwner,{adapter.update(it)})

        return binding.root

}}