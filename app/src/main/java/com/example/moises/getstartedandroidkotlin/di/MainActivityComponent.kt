package com.example.moises.getstartedandroidkotlin.di

import com.example.moises.getstartedandroidkotlin.MainActivity
import com.example.moises.getstartedandroidkotlin.di.util.ScopeActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@ScopeActivity
@Subcomponent(modules = arrayOf(MainActivityModule::class, MainFragmentModule::class))
interface MainActivityComponent: AndroidInjector<MainActivity>{
    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<MainActivity>()
}