package com.example.moises.getstartedandroidkotlin.base

interface BasePresenter<T> {

    fun setView(view: T)

    fun doDispose()
}
