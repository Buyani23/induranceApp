package com.example.buyani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.DatePickerDialog
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import android.widget.Toast

import java.util.*

//Globaliing and 2nd var declarations

var notes = mutableListOf<String>()
var date = mutableListOf<String>()
var morningminutes = mutableListOf<String>()
var afternoonminutes = mutableListOf<String>()

//Input corrections

var isValid: Boolean = true
var isValidx: Boolean = true


class MainActivity2 : AppCompatActivity() {
    //Initializastion of buttons page 2
    private lateinit var submit: Button
    private lateinit var picktime: Button
    private lateinit var clear: Button
    private lateinit var nextpage: Button

    //initialiing of text views page 2

     private lateinit var notes: TextView
     //EditText is for giving values , not reciving
     private lateinit var notesview: EditText
     private lateinit var morningview: EditText
     private lateinit var afternoonview : EditText

     private lateinit var error: TextView

// Check for Correctins on inputs
    fun check(number1: Int,number2: Int) {

        if (number1 > 120 || number2 > 120 ) {
            isValid = false
            error.text = "P;ease enter a valid number"

        } else {
            isValid = true
        }


    }






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
}