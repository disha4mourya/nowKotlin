package com.example.dishamourya.nowkotlin.part2_recycler_view.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.MenuItem
import android.widget.LinearLayout
import com.example.dishamourya.nowkotlin.R
import com.example.dishamourya.nowkotlin.part2_recycler_view.model.User

class RecyclerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_activity)

        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true)

        //getting recyclerview from xml
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)


        //crating an arraylist to store users using the data class user
        val users = ArrayList<User>()

        //adding some dummy data to the list
        users.add(User("Kangaroos", "Australia"))
        users.add(User("Kiwi Birds", "New Zealand"))
        users.add(User("Bulls", "Spain"))
        users.add(User("Lemurs", "Madagascar"))
        users.add(User("Giant Pandas", "China"))

        //creating our adapter
        val adapter = CustomAdapter(users)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter
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
}