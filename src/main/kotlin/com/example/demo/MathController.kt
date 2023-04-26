package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/calc")
class MathController {

    @GetMapping("/sum/{num1}/{num2}")
    fun sum(@PathVariable(value = "num1") num1: String?, @PathVariable(value = "num2") num2: String?): Double {
        if (!ifNumeric(num1) || !ifNumeric(num2)) throw Exception()
        return convertToDouble(num1) + convertToDouble(num2)
    }

    private fun convertToDouble(strNum: String?): Double {
        if(strNum.isNullOrBlank()) return 0.0
        val dotNumber = strNum.replace(",".toRegex(), ".")
        return if (ifNumeric(strNum)) dotNumber.toDouble() else 0.0
    }

    private fun ifNumeric(strNum: String?): Boolean {
        if(strNum.isNullOrBlank()) return false
        val dotNumber = strNum.replace(",".toRegex(),".")
        return dotNumber.matches("""[-+]?[0-9]*\.?[0-9]+""".toRegex())
    }
}
