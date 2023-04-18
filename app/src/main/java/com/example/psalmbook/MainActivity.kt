package com.example.psalmbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.time.LocalDate
import java.time.format.DateTimeFormatter

var currentPsalm = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val formatter = DateTimeFormatter.ofPattern("yyyyMMdd")
        val current = LocalDate.now().format(formatter)

        val title:TextView = findViewById<TextView>(R.id.psalmTitle)
        val text:TextView = findViewById<TextView>(R.id.psalmTitle)

        title.text = getString(R.string.title)
        text.text = getString(R.string.psalm_1)
    }
}