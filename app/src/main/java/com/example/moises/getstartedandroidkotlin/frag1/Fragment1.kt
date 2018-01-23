package com.example.moises.getstartedandroidkotlin.frag1

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.moises.getstartedandroidkotlin.R
import com.example.moises.getstartedandroidkotlin.base.BaseFragment

class Fragment1 : BaseFragment(), Frag1Contract.View {

    var presenter: Frag1Contract.Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = Frag1Presenter(this)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_1, container, false)
    }

    /**
     * Implementation Frag1Contract.View
     */
    override val fragment: Fragment
        get() = this

    override fun showMessage(message: String) {
        showMessageInToast(message)
    }
}