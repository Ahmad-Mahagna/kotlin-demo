data class Product constructor(val id:String, val name:String, val price:Double)

fun main(args: Array<String>) {

    val product = Product(123.str,"iphoneX", 200.0)
    val product2 = product.copy(234.str, "iphoneX", 220.0)

    if (product.price == product2.price)
        println("same price !!!")


    1.str
    println(1 withPrefix "Epid")

}

private infix fun Int.withPrefix(s: String) = "$s-$this"

private val Int.str get() = this.toString()


private operator fun Product.plus(product: Product) = this.price + product.price

