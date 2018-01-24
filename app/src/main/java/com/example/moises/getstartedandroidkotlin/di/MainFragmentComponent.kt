package com.example.moises.getstartedandroidkotlin.di

import com.example.moises.getstartedandroidkotlin.di.util.ScopeFragment
import com.example.moises.getstartedandroidkotlin.main.MainFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector

@ScopeFragment
@Subcomponent(modules = arrayOf(MainFragmentModule::class))
interface MainFragmentComponent: AndroidInjector<MainFragment>{
    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<MainFragment>()
}