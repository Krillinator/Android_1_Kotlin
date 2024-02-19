package com.example.lektion_1_kotlin

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun helloWorld() {
        println("Hello world!")
    }

    @Test
    fun myVariables() {

        // Initialize Variables
            // #1 - var / val
            // #2 - name
            // #3 - Datatype
            // #4 - Value (assignment)

        val isTired: Boolean = true
        val name: String = "Benny"
        val age: Int = 18

        println(isTired)
        println(name)
        println(age)

        // val VS var
        // Immutables!
        val status: Int = 500
        var myStatus: Int = 0

        myStatus = 200

        println(status)
        println(myStatus)

    }

    @Test
    fun myStringTemplates() {

        val name: String = "Benny"
        val age: Int = 25

        println("Hello $name, you are now $age, is that correct?")

    }

    @Test
    fun myDataTypes() {

        /* Data types
        *   Data types, should be used wherever possible
        *   (During instantiation of variables, arrays, objects, params/args)
        * */

        /* PROS
        *   Clear definition, less abstract code, type-safety (compile-time error),
        *   Intellisense hints (args/params, variables, function return types, objects)
        * */

        val name: String

        // println(name)

    }

    @Test
    fun myCollections() {

        // Immutable
        val names = listOf("Benny", "Frida", "Anton")

        // Mutable
        val scoreList = mutableListOf(0, 50, 100)

        println(names)
        println(scoreList)

        // Datatype Test
        val test = listOf<String>()
        val test2: MutableList<String>

        // Count Names
        println("Names list has: ${names.count()}, Items!")

    }

    @Test
    fun myConditionalRenderings() {

        val ageRestriction = 18
        val myAge = 22

        if (myAge >= ageRestriction) {
            println("YOU MAY ENTER")
        } else {
            println("YOU MAY NOT ENTER, TOO YOUNG")
        }

        // Multiple cases - Weekdays

        val weekday = "Monday"

        // Switch-like rendering
        when (weekday) {
            "Monday" -> println("It's monday!")
            "Tuesday" -> println("It's monday!")
            "Wednesday" -> println("It's monday!")
            else -> println("Not a day of the week")
        }



    }

    @Test
    fun myLoops() {

        // Java Reference
        // for (int i = 0; i < 100; i++) {}

        // Name-shadowing (NOT RECOMMENDED)
        val number = 1

        for (number in 1..4) {
            println()
        }

        // Do this instead!
        for (num in 1..4) {
            println(num)
        }

        // Step
        for (stepNum in 1..100 step 2) {
            println(stepNum)
        }

        // DownTo
        for (downToNum in 100 downTo 1) {
            println(downToNum)
        }

        // Chars
        for (myChar in 'A'..'Z') {
            println(myChar)
        }

        // Array Loop
        val cakes = listOf("Strawberry", "Chocolate", "Vanilla")

        for (cake in cakes) {
            println("Yummy, it's a $cake cake")
        }

    }

}


