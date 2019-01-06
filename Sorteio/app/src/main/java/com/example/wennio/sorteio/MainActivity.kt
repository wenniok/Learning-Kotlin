package com.example.wennio.sorteio

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun play(view: View){
        var result = findViewById<View>(R.id.result) as TextView
        var numberDrawn = Random().nextInt(11)
        result.setText("Number drawn is: $numberDrawn")
    }
}
