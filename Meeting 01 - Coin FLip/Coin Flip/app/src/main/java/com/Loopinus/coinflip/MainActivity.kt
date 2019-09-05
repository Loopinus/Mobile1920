package com.Loopinus.coinflip

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val
                flipButton = findViewById<Button>(R.id.btnFlip)


        flipButton.setOnClickListener {
            val r = (1..2).shuffled().first()

            if (r == 1) result.text = "Heads!"
            else {
                result.text = "Tails!"
            }
            Toast.makeText(this@MainActivity, "Flipped", Toast.LENGTH_SHORT).show()
        }









    }
}
