package com.fox.diexample

import javax.inject.Inject

class Computer @Inject constructor (
    val monitor: Monitor,
    val computerTower: ComputerTower,
    val keyboard: Keyboard,
    val mouse: Mouse
        )