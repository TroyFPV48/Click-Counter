package com.example.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var count = 0
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)

        val incrementButton = findViewById<Button>(R.id.button)
        incrementButton.setOnClickListener {
            val prevCount = count
            count++ //increase value
            textView.text = count.toString()
            val message = "Increment: $prevCount -> $count"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }

        val decrementButton = findViewById<Button>(R.id.button2)
        decrementButton.setOnClickListener {
            val prevCount = count
            count-- //decrease value
            textView.text = count.toString() //update textView
            val message = "Decrement: $prevCount -> $count"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }

        val resetButton = findViewById<Button>(R.id.button3)
        resetButton.setOnClickListener {
            val prevCount = count
            count = 0 //reset
            textView.text = count.toString()
            val message = "Reset: $prevCount -> $count"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}