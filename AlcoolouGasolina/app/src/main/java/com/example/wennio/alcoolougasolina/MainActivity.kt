package com.example.wennio.alcoolougasolina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btCalcular(view: View){
        val valorAlcool = edit_text_preco_alcool.text.toString()
        val valorGasolina = edit_text_preco_gasolina.text.toString()
        if (validarCampos(valorAlcool, valorGasolina)){
            calcularMelhorPreco(valorAlcool, valorGasolina)
        }else {
            text_view_resultado.setText("Preencha os precos primeiro!")
        }




    }

    fun calcularMelhorPreco(valorAlcool: String, valorGasolina: String){

        var resultado = valorAlcool.toDouble() / valorGasolina.toDouble()
        if (resultado >= 0.7){
            text_view_resultado.setText("Melhor usar gasolina!")
        }else{
            text_view_resultado.setText("Melhor usar alcool!")
        }

    }

    fun validarCampos (valorAlcool: String, valorGasolina: String): Boolean{
        var camposValidados: Boolean = true
        if (valorAlcool == null || valorAlcool.equals("")){
            camposValidados = false
        }else if (valorGasolina == null || valorGasolina.equals("")){
            camposValidados = false
        }
        return camposValidados
    }

}
