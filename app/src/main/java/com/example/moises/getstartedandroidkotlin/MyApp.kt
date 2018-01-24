package com.example.moises.getstartedandroidkotlin

import android.app.Activity
import android.app.Application
import com.example.moises.getstartedandroidkotlin.di.AppComponent
import com.example.moises.getstartedandroidkotlin.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class MyApp : Application(), HasActivityInjector {
    @Inject lateinit var injector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        setUpDagger()
    }

    private fun setUpDagger(){
        appComponent = DaggerAppComponent.builder().application(this).build()
        appComponent?.inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return injector
    }

    companion object {
        var appComponent: AppComponent? = null
        fun getMainAppComponent(): AppComponent?{
            return appComponent
        }
    }
}