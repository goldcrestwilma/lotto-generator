package com.lotto

import org.junit.Test

import org.junit.Assert.*

class RandomGeneratorTest {

    @Test
    fun name() {
        var number = RandomGenerator.generate()

        println(number)

    }
}