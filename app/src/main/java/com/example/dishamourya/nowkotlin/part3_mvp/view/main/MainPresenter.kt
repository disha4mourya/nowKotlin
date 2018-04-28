package com.example.dishamourya.nowkotlin.part3_mvp.view.main

import com.example.dishamourya.nowkotlin.part3_mvp.model.Data
import com.example.dishamourya.nowkotlin.part3_mvp.view.base.Presenter

class MainPresenter : Presenter<MainView> {
    private var mView: MainView? = null

    override fun onAttach(view: MainView) {
        mView = view
    }

    override fun onDetach() {
        mView = null
    }

    fun showFragment() {
        // Set Data
        val data: Data = Data("Hello from Data!")

        // Show Fragment with Data
        mView?.onShowFragment(data)
    }
}