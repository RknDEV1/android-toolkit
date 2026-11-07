package com.rkndev.toolkit.formatters

import java.text.NumberFormat
import java.util.Locale

object Formatters {

    private val brLocale = Locale("pt", "BR")

    fun currency(value: Double): String {
        val formatter = NumberFormat.getCurrencyInstance(brLocale)
        return formatter.format(value)
    }

    fun phone(input: String): String {
        val digits = input.filter { it.isDigit() }
        return when (digits.length) {
            11 -> "(${digits.substring(0, 2)}) ${digits.substring(2, 7)}-${digits.substring(7)}"
            10 -> "(${digits.substring(0, 2)}) ${digits.substring(2, 6)}-${digits.substring(6)}"
            else -> digits
        }
    }

    fun cep(input: String): String {
        val digits = input.filter { it.isDigit() }
        return if (digits.length == 8) {
            "${digits.substring(0, 5)}-${digits.substring(5)}"
        } else digits
    }

    fun cpf(input: String): String {
        val digits = input.filter { it.isDigit() }
        return if (digits.length == 11) {
            "${digits.substring(0, 3)}.${digits.substring(3, 6)}.${digits.substring(6, 9)}-${digits.substring(9)}"
        } else digits
    }
}
