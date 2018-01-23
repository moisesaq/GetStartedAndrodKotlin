package com.example.moises.getstartedandroidkotlin.main

import com.example.moises.getstartedandroidkotlin.base.BasePresenter
import com.example.moises.getstartedandroidkotlin.base.BaseView

interface MainContract {

    interface View: BaseView {
        fun showData()
    }

    interface Presenter: BasePresenter<View> {

        fun loadData()
    }
}