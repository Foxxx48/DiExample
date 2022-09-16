package com.fox.diexample

import dagger.Component

@Component(modules = [ComputerModule::class])
interface MyComponent {

//    fun getKeyboard(): Keyboard
//
//    fun getMouse(): Mouse
//
//    fun getMonitor(): Monitor

    fun inject(activity: Activity)
}