package com.example.moises.getstartedandroidkotlin.frag2

import com.example.moises.getstartedandroidkotlin.base.BasePresenter
import com.example.moises.getstartedandroidkotlin.base.BaseView

interface Frag2Contract {

    interface View: BaseView {
        fun showUpdatedMessage(message: String)
    }

    interface Presenter: BasePresenter<View> {

        fun updateMessage()
    }
}