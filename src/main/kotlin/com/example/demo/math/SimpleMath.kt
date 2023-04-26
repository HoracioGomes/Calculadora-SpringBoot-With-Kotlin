package com.example.demo.math

import kotlin.math.sqrt

class SimpleMath {

    fun sum(num1: Double, num2: Double) = num1 + num2
    fun sub(num1: Double, num2: Double) = num1 - num2
    fun mult(num1: Double, num2: Double) = num1 * num2
    fun div(num1: Double, num2: Double) = num1 / num2
    fun mean(num1: Double, num2: Double) = (num1 + num2) / 2
    fun square(num: Double) = sqrt(num)
}