package com.example.animation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import kotlinx.android.synthetic.main.activity_tween.*

class TweenActivity : AppCompatActivity() {

    lateinit var anim: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tween)

        tween_start.setOnClickListener {
            anim = AnimationUtils.loadAnimation(this, R.anim.anim_example)
            tween_start.startAnimation(anim)
        }

        val button = findViewById<Button>(R.id.back)

        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }
    }
}
