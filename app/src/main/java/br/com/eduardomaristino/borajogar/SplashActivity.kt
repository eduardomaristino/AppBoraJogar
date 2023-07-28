package br.com.eduardomaristino.borajogar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Abrir a LoginActivity após esperar 2.5 segundos
        Handler(Looper.getMainLooper()).postDelayed({

            // Criando um intent e guardando ela em uma variável
            val myIntent = Intent(this, HelloActivity::class.java)

            // Iniciar a intent
            startActivity(myIntent)

            // Finalizando a SplashActivity
            finish()

        }, 2500)
    }
}