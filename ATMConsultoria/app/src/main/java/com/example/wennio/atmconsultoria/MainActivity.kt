package com.example.wennio.atmconsultoria

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_clientes.setOnClickListener(){
            val intent = Intent(this, DetalheClientesActivity::class.java)
            startActivity(intent)
        }

        bt_empresa.setOnClickListener(){
            val intent = Intent(this, DetalheEmpresaActivity::class.java)
            startActivity(intent)
        }

        bt_servicos.setOnClickListener(){
            val intent = Intent(this, DetalheServicosActivity::class.java)
            startActivity(intent)
        }

        bt_contato.setOnClickListener(){
            val intent = Intent(this, DetalheContatoActivity::class.java)
            startActivity(intent)
        }

    }
}
