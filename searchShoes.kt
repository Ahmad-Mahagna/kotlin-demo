package com.general.kotlin.demo

fun searchShoes(size: Int, color: String = "Black", style: String = "defaultStyle", isUnisex: Boolean = true) {
        TODO("Waiting for PM decision")
}


fun main(args: Array<String>) {
    searchShoes(19)
    searchShoes(19, isUnisex = false)
    searchShoes(19, style = "sport", isUnisex = false)
}