package com.example.moises.getstartedandroidkotlin.frag1

class Frag1Presenter(view: Frag1Contract.View): Frag1Contract.Presenter {

    val viewFrag1 = view

    override fun setView(view: Frag1Contract.View) {}

    override fun doDispose() {
    }

    override fun loadMessage() {
        viewFrag1.showMessage("Message FRAGMENT 1")
    }
}