package com.example.moises.getstartedandroidkotlin.frag1

import com.example.moises.getstartedandroidkotlin.base.BasePresenter
import com.example.moises.getstartedandroidkotlin.base.BaseView

interface Frag1Contract {

    interface View: BaseView {
        fun showMessage(message: String)
    }

    interface Presenter: BasePresenter<View>{

        fun loadMessage()
    }
}