package com.example.dishamourya.nowkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    companion object {
        const val TOTAL_COUNT = "total_count"
    }
}
