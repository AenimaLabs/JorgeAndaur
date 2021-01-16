package com.example.jorgeandaur.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jorgeandaur.R
import com.example.jorgeandaur.databinding.FragmentListingBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListingFragment : Fragment() {

    private lateinit var binding : FragmentListingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListingBinding.inflate(layoutInflater)

        binding.rvBookList.layoutManager = LinearLayoutManager(context)

        return binding.root

}}