package com.example.moises.getstartedandroidkotlin.main

import javax.inject.Inject

class MainPresenter @Inject constructor(): MainContract.Presenter {

    var viewMain: MainContract.View? = null

    override fun setView(view: MainContract.View) {
        viewMain = view
    }

    override fun doDispose() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}