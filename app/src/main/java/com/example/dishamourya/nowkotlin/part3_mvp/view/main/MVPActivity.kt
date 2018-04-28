package com.example.dishamourya.nowkotlin.part3_mvp.view.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.View
import com.example.dishamourya.nowkotlin.R
import com.example.dishamourya.nowkotlin.part3_mvp.model.Data
import com.example.dishamourya.nowkotlin.part3_mvp.view.next.NextFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.nav_activity_main.*

class MVPActivity : AppCompatActivity(), MainView {
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nav_activity_main)

        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true)

        initPresenter()
        onAttach()
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
    override fun onAttach() {
        presenter.onAttach(this)
        addButtonListener()
    }

    override fun onDetach() {
        presenter.onDetach()
    }

    override fun onShowFragment(data: Data) {
        // Get Data
        val bundle: Bundle = Bundle()
        bundle.putString("data", data.text)

        // Show Fragment with Data
        val tag: String = NextFragment::class.java.simpleName
        val fragment: Fragment = NextFragment().newInstance()
        fragment.arguments = bundle

        // Begin Fragment Transaction
        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fl_main, fragment, tag)
        fragmentTransaction.commit()
    }

    override fun onDestroy() {
        onDetach()
        super.onDestroy()
    }

    private fun initPresenter() {
        presenter = MainPresenter()
    }


    private fun addButtonListener() {
        btn_main.setOnClickListener { view ->
            btn_main.visibility = View.GONE
            presenter.showFragment()
        }
    }
}