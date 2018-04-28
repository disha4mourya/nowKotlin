package com.example.dishamourya.nowkotlin.part3_mvp.view.main

import com.example.dishamourya.nowkotlin.part3_mvp.model.Data
import com.example.dishamourya.nowkotlin.part3_mvp.view.base.View

interface MainView : View {
    fun onShowFragment(data: Data)
}