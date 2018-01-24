package com.example.moises.getstartedandroidkotlin.di

import android.support.v4.app.Fragment
import com.example.moises.getstartedandroidkotlin.di.util.ScopeFragment
import com.example.moises.getstartedandroidkotlin.main.MainContract
import com.example.moises.getstartedandroidkotlin.main.MainFragment
import com.example.moises.getstartedandroidkotlin.main.MainPresenter
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import dagger.android.support.FragmentKey
import dagger.multibindings.IntoMap

@Module
abstract class MainFragmentModule {

    @Binds
    @IntoMap
    @FragmentKey(MainFragment::class)
    abstract fun bindMainFragmentInjectorFactory(builder: MainFragmentComponent.Builder):
            AndroidInjector.Factory<out Fragment>


    @Module
    object MainFragmentModule{
        @Provides
        @ScopeFragment
        fun provideMainPresenter(): MainPresenter{
            return MainPresenter()
        }
    }
}