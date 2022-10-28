package com.viomi.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.viomi.kotlindemo.databinding.ActivityGpsBinding

class GPSActivity : AppCompatActivity() {
    private lateinit var binding:ActivityGpsBinding
    private val TAG = "GPSActivity"
            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
                binding = ActivityGpsBinding.inflate(layoutInflater)
                setContentView(binding.root)
                Log.d(TAG,"hello Kotlin!")
                binding.tvAddressValue.setText(TAG)

    }
}