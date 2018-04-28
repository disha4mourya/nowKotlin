package com.example.dishamourya.nowkotlin.part1_base

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.dishamourya.nowkotlin.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true)
    }

    fun myToast(view: View) {
        val myToast = Toast.makeText(
                this,
                "Click the button to increase count.",
                Toast.LENGTH_LONG
        )
        myToast.show()

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    fun countMe(view: View) {
        // Get the text view
        val showCountTextView = findViewById(R.id.tvMyContent) as TextView

        // Get the value of the text view.
        val countString = showCountTextView.text.toString()

        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++

        // Display the new value in the text view.
        showCountTextView.text = count.toString();
    }

    fun randomMe(view: View) {
        // Create an Intent to start the second activity
        val randomIntent = Intent(this, SecondActivity::class.java)

        val showCountTextView = findViewById(R.id.tvMyContent) as TextView

        // Get the current value of the text view.
        val countString = showCountTextView.text.toString()

        // Convert the count to an int
        val count = Integer.parseInt(countString)

        // Add the count to the extras for the Intent.
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        // Start the new activity.
        startActivity(randomIntent)
    }
}

