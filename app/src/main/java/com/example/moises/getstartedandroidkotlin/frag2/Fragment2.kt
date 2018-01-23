package com.example.moises.getstartedandroidkotlin.frag2

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.moises.getstartedandroidkotlin.R
import com.example.moises.getstartedandroidkotlin.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_2.view.*

class Fragment2 : BaseFragment(), Frag2Contract.View {

    private var message: String? = null
    var presenter: Frag2Contract.Presenter? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        presenter = Frag2Presenter()
        presenter?.setView(this)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null)
            message = arguments.getString(ARG_PARAM1)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_2, container, false)
        setUp(view)
        return view
    }

    private fun setUp(view: View){
        view.tv_message.setText(message)
    }

    companion object {
        private val ARG_PARAM1 = "param1"
        fun newInstance(param1: String): Fragment2 {
            val fragment = Fragment2()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            fragment.arguments = args
            return fragment
        }
    }

    /**
     * Implementation Frag2Contract.View
     */
    override val fragment: Fragment
        get() = this

    override fun showUpdatedMessage(message: String) {
        showMessageInToast(message)
    }
}