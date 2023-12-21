package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val rnds = (0..912).random()

        val button: Button = findViewById(R.id.button)
        //val textView: TextView = findViewById(R.id.textView)
        button.setOnClickListener {
            val newIntentProvider1 = Intent(this, MainActivity2::class.java)
            startActivities(arrayOf(newIntentProvider1))
            //button.setVisibility(View.INVISIBLE)
            //textView.text = "$rnds"
        }
    }
}