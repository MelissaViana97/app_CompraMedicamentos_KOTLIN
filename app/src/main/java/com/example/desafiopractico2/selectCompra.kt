package com.example.desafiopractico2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class selectCompra : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selectcompra)

        //Boton a pantalla de pre-orden

        val btn: Button =findViewById(R.id.buttonselect)
        btn.setOnClickListener{

            val intent: Intent =Intent(this,selectCompra::class.java)
            startActivity(intent)
        }



        }
    }
