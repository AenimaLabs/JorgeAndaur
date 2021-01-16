package com.example.jorgeandaur.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.jorgeandaur.databinding.FragmetDetailBinding

class DetailFragment: Fragment() {

    private lateinit var binding: FragmetDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       // binding =FragmentDetailBinding.inflate

            return super.onCreateView(inflater, container, savedInstanceState)
    }


}