package com.example.tiptime

import org.junit.Test

import org.junit.Assert.*
import java.text.NumberFormat
import java.util.Currency

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class TipCalculatorTests {
    @Test
    fun calculateTip_20PercentNoRoundup() {
        val amount = 10.00
        val tipPercent = 20.00

        val rupeeFormat = NumberFormat.getCurrencyInstance()
        rupeeFormat.currency = Currency.getInstance("INR")

        val expectedTip = rupeeFormat.format(2)
        val actualTip = calculateTip(amount, tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}