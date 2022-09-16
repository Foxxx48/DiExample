package com.fox.diexample

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var computer: Computer


    init {
        DaggerMyComponent.create().inject(this)
    }

//    val keyboard: Keyboard = DaggerMyComponent.create().getKeyboard()
//
//    val mouse: Mouse = DaggerMyComponent.create().getMouse()
//
//    val monitor: Monitor = DaggerMyComponent.create().getMonitor()


}