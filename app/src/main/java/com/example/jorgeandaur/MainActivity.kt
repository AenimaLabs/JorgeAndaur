package com.example.jorgeandaur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.jorgeandaur.view.ListingFragment
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private val vm : MyViewModel by viewModels()
    private val viewModel by viewModels<MyViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initLog()

        supportFragmentManager.beginTransaction().add(R.id.main_container, ListingFragment()).commit()



    }


    private fun initLog() {
        if (BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }
    }
}