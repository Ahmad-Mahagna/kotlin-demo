package com.general.kotlin.demo

fun main(args: Array<String>) {

    val firstPair = listOf("kotlin", "java", "C", "C#", "C++")
            .map(String::toUpperCase)
            .filter { !it.contains('C') && it != "JAVA" }
            .sortedBy { it }
            .map { it to "convert to JAVA" }
            .first()

    println()
    //map.forEach(::println)

}