package com.example.moises.getstartedandroidkotlin.di

import android.content.Context
import com.example.moises.getstartedandroidkotlin.MyApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = arrayOf(MainActivityComponent::class))
class AppModule {

    @Singleton
    @Provides
    fun provideContext(myApp: MyApp): Context {
        return myApp.applicationContext
    }
}