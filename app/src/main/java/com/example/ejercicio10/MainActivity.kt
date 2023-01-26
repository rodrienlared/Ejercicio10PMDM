package com.example.ejercicio10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.ejercicio10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        cambiarImagenSuperiorConTiempo()
        cambiarImagenInferiorConTiempo()

        funcionDado()
    }

    private fun funcionDado() {
        binding.imagenInferior.setOnClickListener {
            when((0..4).random()){
                1 -> startActivity(Intent(this, Objeto::class.java))
                2 -> startActivity(Intent(this, Ciudad::class.java))
                3 -> startActivity(Intent(this, Mercader::class.java))
                4 -> startActivity(Intent(this, Enemigo::class.java))
            }
        }
    }

    private fun cambiarImagenInferiorConTiempo() {
        var i = 0
        val imagenes = arrayOf(R.drawable.dado_normal, R.drawable.dado_invertido)
        val handler = Handler(Looper.getMainLooper())

        val runnable = object : Runnable {
            override fun run() {
                binding.imagenInferior.setImageResource(imagenes[i++ % imagenes.size])
                handler.postDelayed(this, 500) // delay de 500ms
            }
        }
        handler.post(runnable)
    }

    private fun cambiarImagenSuperiorConTiempo() {
        var i = 0
        val imagenes = arrayOf(R.drawable.campo, R.drawable.montana, R.drawable.cueva)
        val handler = Handler(Looper.getMainLooper())

        val runnable = object : Runnable {
            override fun run() {
                binding.imagenSuperior.setImageResource(imagenes[i++ % imagenes.size])
                handler.postDelayed(this, 2000) // delay de 1 segundo
            }
        }
        handler.post(runnable)
    }
}