package com.example.moises.getstartedandroidkotlin.main


class MainPresenter(view: MainContract.View): MainContract.Presenter {

    val viewMain = view

    override fun setView(view: MainContract.View) {}

    override fun doDispose() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}