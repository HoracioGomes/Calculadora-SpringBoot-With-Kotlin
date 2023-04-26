package com.example.demo.control

import com.example.demo.converters.NumberConverter.convertToDouble
import com.example.demo.converters.NumberConverter.ifNumeric
import com.example.demo.exception.UnsupportedMatchOperationException
import com.example.demo.math.SimpleMath
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/calc")
class MathController {

    val math = SimpleMath()

    @GetMapping("/sum/{num1}/{num2}")
    fun sum(@PathVariable(value = "num1") num1: String?, @PathVariable(value = "num2") num2: String?): Double {
        if (!ifNumeric(num1) || !ifNumeric(num2)) throw UnsupportedMatchOperationException("Utilize apenas valores numéricos!")
        return math.sum(convertToDouble(num1), convertToDouble(num2))
    }

    @GetMapping("/sub/{num1}/{num2}")
    fun sub(@PathVariable(value = "num1") num1: String?, @PathVariable(value = "num2") num2: String?): Double {
        if (!ifNumeric(num1) || !ifNumeric(num2)) throw UnsupportedMatchOperationException("Utilize apenas valores numéricos!")
        return math.sub(convertToDouble(num1), convertToDouble(num2))
    }

    @GetMapping("/mult/{num1}/{num2}")
    fun mult(@PathVariable(value = "num1") num1: String?, @PathVariable(value = "num2") num2: String?): Double {
        if (!ifNumeric(num1) || !ifNumeric(num2)) throw UnsupportedMatchOperationException("Utilize apenas valores numéricos!")
        return math.mult(convertToDouble(num1), convertToDouble(num2))
    }

    @GetMapping("/div/{num1}/{num2}")
    fun div(@PathVariable(value = "num1") num1: String?, @PathVariable(value = "num2") num2: String?): Double {
        if (!ifNumeric(num1) || !ifNumeric(num2)) throw UnsupportedMatchOperationException("Utilize apenas valores numéricos!")
        return math.div(convertToDouble(num1), convertToDouble(num2))
    }

    @GetMapping("/mean/{num1}/{num2}")
    fun mean(@PathVariable(value = "num1") num1: String?, @PathVariable(value = "num2") num2: String?): Double {
        if (!ifNumeric(num1) || !ifNumeric(num2)) throw UnsupportedMatchOperationException("Utilize apenas valores numéricos!")
        return math.mean(convertToDouble(num1), convertToDouble(num2))
    }

    @GetMapping("/square/{num}")
    fun mean(@PathVariable(value = "num") num: String?): Double {
        if (!ifNumeric(num)) throw UnsupportedMatchOperationException("Utilize apenas valores numéricos!")
        return math.square(convertToDouble(num))
    }

}
