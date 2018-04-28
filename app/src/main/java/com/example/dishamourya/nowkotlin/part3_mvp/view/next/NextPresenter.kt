package com.example.dishamourya.nowkotlin.part3_mvp.view.next

import com.example.dishamourya.nowkotlin.part3_mvp.view.base.Presenter

class NextPresenter : Presenter<NextView> {
    private var mView: NextView? = null

    override fun onAttach(view: NextView) {
        mView = view
    }

    override fun onDetach() {
        mView = null
    }

    fun showText(text: String) {
        mView?.onShowResult(text)
    }
}