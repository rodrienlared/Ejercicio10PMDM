package com.example.ejercicio10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio10.databinding.ActivityObjetoBinding

class Objeto : AppCompatActivity() {

    private lateinit var binding: ActivityObjetoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityObjetoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recoger.setOnClickListener {
            startActivity(Intent(this, ActivityEnBlanco::class.java))
        }

        binding.continuar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}