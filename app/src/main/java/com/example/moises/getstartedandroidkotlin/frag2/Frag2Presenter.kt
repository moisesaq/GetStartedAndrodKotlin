package com.example.moises.getstartedandroidkotlin.frag2


class Frag2Presenter: Frag2Contract.Presenter {

    var viewFrag2: Frag2Contract.View? = null

    override fun setView(view: Frag2Contract.View) {
        viewFrag2 = view
    }

    override fun doDispose() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateMessage() {
        viewFrag2?.showUpdatedMessage("Message fragment 2 :)")
    }
}