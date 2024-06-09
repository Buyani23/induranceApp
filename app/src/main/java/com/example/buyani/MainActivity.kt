package com.example.buyani

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.coroutines.delay
import kotlinx.coroutines.*
var isPressed: Boolean = false
class MainActivity : AppCompatActivity() {
    //declarations
    private lateinit var exit :Button
    private lateinit var next : Button



    //Time delay

    private fun runTimer(intent: Intent) {


        CoroutineScope(Dispatchers.Main).launch {
            delay(5000)

            if (isPressed == false) {

                startActivity(intent)
            }
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //button function ( findview by id)
        val intent = Intent(this, MainActivity2::class.java)

        exit= findViewById(R.id.Exit)
        next= findViewById(R.id.Next)

        next.setOnClickListener {
            //screen shows once
            isPressed = true
            startActivity(intent)

        }

        exit.setOnClickListener {



            finishAffinity()
        }
        runTimer(intent)
        }


}