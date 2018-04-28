package com.example.dishamourya.nowkotlin.part3_mvp.view.base


interface Presenter<in T : View> {
    fun onAttach(view: T)

    fun onDetach()
}