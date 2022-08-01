package com.example.emduvidamechame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit public var texto: TextView

    val frases = arrayOf("Danilo decide!","Lari decide!",
        "Lucas decide","Apertem os cintos e só vamo!",
        "Escolham outro lugar, nesse ai a gente não vai!")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         texto = findViewById(R.id.textoFrase) as TextView
    }


    fun gerarFrase(view: View){
        val totalItens = frases.size
        val numAleatorio = Random().nextInt(totalItens)

        texto.setText(frases[numAleatorio])
    }

}