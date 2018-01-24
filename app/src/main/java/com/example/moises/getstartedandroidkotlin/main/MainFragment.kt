package com.example.moises.getstartedandroidkotlin.main

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.moises.getstartedandroidkotlin.R
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*
import javax.inject.Inject

class MainFragment @Inject constructor(): Fragment(), MainContract.View, View.OnClickListener {

    private var mListener: OnMainFragmentListener? = null
    @Inject lateinit var presenter: MainPresenter

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
        //presenter = MainPresenter(this)
        presenter.setView(this)
        if (context !is OnMainFragmentListener)
            throw RuntimeException(context!!.toString() + " must implement OnMainFragmentListener")
        mListener = context
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_main, container, false)
        setUp(view)
        return view
    }

    private fun setUp(view: View){
        view.btn_go_fragment1.setOnClickListener(this)
        view.btn_go_fragment2.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            btn_go_fragment1.id -> mListener?.onGoFragment1Click()
            btn_go_fragment2.id -> mListener?.onGoFragment2Click("Hello android Kotlin")
        }
    }

    override fun onDetach() {
        super.onDetach()
        mListener = null
    }

    interface OnMainFragmentListener {
        fun onGoFragment1Click()

        fun onGoFragment2Click(message: String);
    }

    companion object {
        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

    /**
     * Implementation MainContract.View
     */
    override val fragment: Fragment
        get() = this

    override fun showData() {
    }
}
