package com.bignerdranch.android.wetherapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.lifecycle.asLiveData
import com.bignerdranch.android.wetherapi.Fragments.MainFragment
import com.bignerdranch.android.wetherapi.adapters.WeatherModel
import com.bignerdranch.android.wetherapi.database.WeatherDatabase
import kotlinx.coroutines.flow.Flow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.placeHolder, MainFragment.newInstance())
            .commit()
    }
}