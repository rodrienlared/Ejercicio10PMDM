package com.example.ejercicio10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio10.databinding.ActivityMercaderBinding
import com.example.ejercicio10.databinding.ActivityObjetoBinding

class Mercader : AppCompatActivity() {

    private lateinit var binding: ActivityMercaderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMercaderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.comerciar.setOnClickListener {
            startActivity(Intent(this, ActivityEnBlanco::class.java))
        }

        binding.continuarMercader.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}