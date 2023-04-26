package com.example.demo.converters

object NumberConverter {

    fun convertToDouble(strNum: String?): Double {
        if (strNum.isNullOrBlank()) return 0.0
        val dotNumber = strNum.replace(",".toRegex(), ".")
        return if (ifNumeric(strNum)) dotNumber.toDouble() else 0.0
    }

    fun ifNumeric(strNum: String?): Boolean {
        if (strNum.isNullOrBlank()) return false
        val dotNumber = strNum.replace(",".toRegex(), ".")
        return dotNumber.matches("""[-+]?[0-9]*\.?[0-9]+""".toRegex())
    }
}