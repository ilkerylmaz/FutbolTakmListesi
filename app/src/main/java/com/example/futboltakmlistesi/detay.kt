package com.example.futboltakmlistesi

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class detay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detay)

        var intent = intent

        var callAge = intent.getStringExtra("age")
        var callName = intent.getStringExtra("name")
        var callGoal = intent.getStringExtra("totalGoal")
        var callMatch = intent.getStringExtra("totalMatch")
        var image = intent.getIntExtra("image", 0)

        var imageView = findViewById<ImageView>(R.id.imageView2)
        var age = findViewById<TextView>(R.id.secondPageAge)
        var name = findViewById<TextView>(R.id.secondPageName)
        var totalGoal = findViewById<TextView>(R.id.totalGoal)
        var totalMatch = findViewById<TextView>(R.id.totalMatch)


        imageView.setImageResource(image)
        age.text = callAge
        name.text = callName
        totalGoal.text = callGoal
        totalMatch.text = callMatch

    }
}