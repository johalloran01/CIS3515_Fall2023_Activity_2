package edu.temple.inclassuiacvitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val displayTextView = findViewById<TextView>(R.id.textDisplay)

        /* Step 1: Populate this array */
        //Create an array, and populate it with incrementing numbers starting at 0
        //https://kotlinlang.org/docs/arrays.html#primitive-type-arrays
        val numberArray = Array(100) {it * 1}

        /* Step 2: Create adapter to display items from array in Spinner */
        //Created an adapter to display the items from numberArray

        val adapter = ArrayAdapter(this, android.R.Layout.simple_spinner_dropdown_item, numberArray)
        spinner.adapter = adapter


        // Step 3: Change TextView's text size to the number selected in the Spinner */
        //spinner.onItemSelectedListener = object: ...

    }
}