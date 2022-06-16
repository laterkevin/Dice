package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val diceImage: ImageView = findViewById(R.id.dice_image)


        rollButton.setOnClickListener {
            rollTheDice(diceImage)
        }
    }

    fun rollTheDice(imageView: ImageView) {
        val rollResult: Int = (1..6).random()
        when (rollResult) {
            1 -> imageView.setImageResource(R.drawable.one)
            2 -> imageView.setImageResource(R.drawable.two)
            3 -> imageView.setImageResource(R.drawable.three)
            4 -> imageView.setImageResource(R.drawable.four)
            5 -> imageView.setImageResource(R.drawable.five)
            6 -> imageView.setImageResource(R.drawable.six)
        }
    }
}