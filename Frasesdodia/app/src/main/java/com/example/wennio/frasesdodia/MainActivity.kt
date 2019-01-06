package com.example.wennio.frasesdodia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    val frases = arrayOf(
        "Não deixe que as pessoas te façam desistir daquilo que você mais quer na vida. Acredite. Lute. Conquiste. E acima de tudo, seja feliz.",
        "Não importa o que você decidiu. O que importa é que isso te faça feliz.",
        "Algumas vezes coisas ruins acontecem em nossas vidas para nos colocar na direção das melhores coisas que poderíamos viver.",
        "Se a vida não ficar mais fácil, trate de ficar mais forte."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textoFrase) as TextView

    }

    fun gerarFrase(view: View){
        var qtdFrases = frases.size
        val numeroAleatorio = Random().nextInt( qtdFrases )
        texto.setText( frases[numeroAleatorio] )

    }
}
