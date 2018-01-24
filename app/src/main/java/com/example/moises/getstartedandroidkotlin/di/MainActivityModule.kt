package com.example.moises.getstartedandroidkotlin.di

import android.app.Activity
import com.example.moises.getstartedandroidkotlin.MainActivity
import com.example.moises.getstartedandroidkotlin.di.util.ScopeActivity
import com.example.moises.getstartedandroidkotlin.main.MainFragment
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

@Module(subcomponents = arrayOf(MainFragmentComponent::class))
abstract class MainActivityModule{

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindMainActivityInjectorFactory(builder: MainActivityComponent.Builder):
            AndroidInjector.Factory<out Activity>

    @Module
    object MainActivityModule{
        @Provides
        @ScopeActivity
        fun provideMainFragment(): MainFragment{
            return MainFragment()
        }
    }
}