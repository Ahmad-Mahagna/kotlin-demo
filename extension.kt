package com.general.kotlin.demo

data class Product constructor(val id:String, val name:String, val price:Double)


private fun extensin() {

    var product1 = Product(1.str, "iphone8", 200.0)
    var product2 = Product(2.str, "iphoneX", 210.0)

    println(product1 + product2)

    1.str
    println(1.withSuffix("epid"))
    println(1 withSuffix "epid")

}

private infix fun Int.withSuffix(s: String) = "$this$s"

private val Int.str get() = this.toString()



private operator fun Product.plus(product2: Product) = this.price + product2.price
