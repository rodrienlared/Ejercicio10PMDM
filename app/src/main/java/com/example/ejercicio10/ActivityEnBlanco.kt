package com.example.ejercicio10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio10.databinding.ActivityEnBlancoBinding

class ActivityEnBlanco : AppCompatActivity() {

    private lateinit var binding: ActivityEnBlancoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEnBlancoBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}