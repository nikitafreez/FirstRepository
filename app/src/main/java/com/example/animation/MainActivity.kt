package com.example.animation


import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var anim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.frame)

        button.setOnClickListener {
            val intent = Intent(this, FrameActivity::class.java)

            startActivity(intent)
        }

        val button1 = findViewById<Button>(R.id.tween)

        button1.setOnClickListener {
            val intent = Intent(this, TweenActivity::class.java)

            startActivity(intent)
        }
    }
}