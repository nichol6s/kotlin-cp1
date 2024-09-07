package com.example.cp1_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondScreen : AppCompatActivity() {
    lateinit var buttonAbrir: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_screen)

        buttonAbrir = findViewById<Button>(R.id.btnStart2)
        buttonAbrir.setOnClickListener {
            var navegarTerceiraTela = Intent(this, UserScreen::class.java)
            startActivity(navegarTerceiraTela)
        }

    }
}