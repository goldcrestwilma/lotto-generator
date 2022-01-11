package com.lotto

class RandomGenerator {

    companion object {
        fun generate() : Int {
            return (0..45).random()
        }
    }
}
