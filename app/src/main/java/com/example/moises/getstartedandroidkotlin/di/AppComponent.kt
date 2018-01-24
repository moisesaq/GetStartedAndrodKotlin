package com.example.moises.getstartedandroidkotlin.di

import com.example.moises.getstartedandroidkotlin.MyApp
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class, MainActivityModule::class))
interface AppComponent{
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(myApp: MyApp): Builder

        fun build(): AppComponent
    }

    fun inject(myApp: MyApp)
}