package edu.temple.inclassuiacvitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemSelectedListener

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

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, numberArray)
        spinner.adapter = adapter


        // Step 3: Change TextView's text size to the number selected in the Spinner */
        //Change the textView's size when selected

        //Listen for item selection
        spinner.onItemSelectedListener = object : OnItemSelectedListener {
            //Target item selected
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                val selectedItem = numberArray[position]

                //Change text size
                displayTextView.textSize = selectedItem.toFloat()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                //Handle if nothing

            }

        }

    }
}