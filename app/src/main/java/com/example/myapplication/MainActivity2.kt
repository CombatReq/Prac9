package com.example.myapplication
import kotlin.random.Random
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val randomNumber1 = Random.nextInt(0, 1001)
        val randomNumber2 = Random.nextInt(0, randomNumber1 + 1)

        val textView1 = findViewById<TextView>(R.id.textView2)
        val textView2 = findViewById<TextView>(R.id.textView3)

        textView1.text = "Рандомное число до $randomNumber1"
        textView2.text = randomNumber2.toString()
    }

}