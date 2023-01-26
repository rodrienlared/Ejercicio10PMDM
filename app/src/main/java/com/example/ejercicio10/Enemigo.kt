package com.example.ejercicio10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio10.databinding.ActivityEnemigoBinding
import com.example.ejercicio10.databinding.ActivityObjetoBinding

class Enemigo : AppCompatActivity() {

    private lateinit var binding: ActivityEnemigoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEnemigoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.luchar.setOnClickListener {
            startActivity(Intent(this, ActivityEnBlanco::class.java))
        }

        binding.huir.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}