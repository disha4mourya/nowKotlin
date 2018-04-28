package com.example.dishamourya.nowkotlin.base

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.dishamourya.nowkotlin.R
import com.example.dishamourya.nowkotlin.part1_base.MainActivity
import com.example.dishamourya.nowkotlin.part1_base.SecondActivity
import com.example.dishamourya.nowkotlin.part2_recycler_view.view.RecyclerActivity
import com.example.dishamourya.nowkotlin.part3_mvp.view.main.MVPActivity
import kotlinx.android.synthetic.main.activity_navigation_kotlin.*
import kotlinx.android.synthetic.main.app_bar_navigation_kotlin.*

class NavigationActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_kotlin)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.part_one -> {
               startActivity( Intent(this, MainActivity::class.java))
            }
            R.id.part_two -> {
                startActivity( Intent(this, RecyclerActivity::class.java))

            }
            R.id.part_three -> {
                startActivity( Intent(this, MVPActivity::class.java))
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
