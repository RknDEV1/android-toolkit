package com.rkndev.toolkit.validators

object Validators {

    fun isValidEmail(email: String): Boolean {
        val trimmed = email.trim()
        if (trimmed.isEmpty()) return false
        val pattern = "^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
        return trimmed.matches(pattern.toRegex())
    }

    fun isValidCPF(cpf: String): Boolean {
        val digits = cpf.filter { it.isDigit() }
        if (digits.length != 11) return false
        if (digits.toSet().size == 1) return false

        val numbers = digits.map { it.digitToInt() }

        fun checkDigit(slice: List<Int>, factor: Int): Int {
            var sum = 0
            var current = factor
            for (n in slice) {
                sum += n * current
                current--
            }
            val remainder = (sum * 10) % 11
            return if (remainder == 10) 0 else remainder
        }

        val d1 = checkDigit(numbers.take(9), 10)
        if (d1 != numbers[9]) return false

        val d2 = checkDigit(numbers.take(10), 11)
        return d2 == numbers[10]
    }
}
