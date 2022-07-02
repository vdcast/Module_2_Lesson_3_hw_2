package com.example.module_2_lesson_3_hw_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        clInfo.visibility = View.GONE

        val pin = "0000"

        btPin.setOnClickListener {
            if (etPin.text.toString() == pin){
                clInfo.visibility = View.VISIBLE
                clPin.visibility = View.GONE
            }else{
                tvAlert.text = "Wrong PIN. Try again."
            }
        }

        btCheckBalance.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

    }
}