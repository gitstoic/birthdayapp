package com.example.myapplication

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val image : ImageView = findViewById(R.id.imageView)
    val submitButton : Button = findViewById(R.id.submit)
    val constraintLayout : ConstraintLayout = findViewById(R.id.constraintLayout)

    submitButton.setOnClickListener {
        image.visibility = View.VISIBLE
        constraintLayout.setBackgroundColor(Color.parseColor("#ffbb22"))
    }
    }
}