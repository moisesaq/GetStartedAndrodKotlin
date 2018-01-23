package com.example.moises.getstartedandroidkotlin.base

import android.support.v4.app.Fragment
import android.widget.Toast

open class BaseFragment: Fragment(){

    fun showMessageInToast(message: String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}