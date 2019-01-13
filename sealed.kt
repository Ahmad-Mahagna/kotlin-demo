package com.general.kotlin.demo


sealed class Response
data class SUCCESS(val product: Product) : Response()
data class FAILURE(val error: String) : Response()
data class FAILURE2(val error: String) : Response()




private fun getResponse(responseSuccess: Boolean) = if (responseSuccess) SUCCESS(Product("1", "iphine", 2.9)) else FAILURE("failed")


fun main(args: Array<String>) {

    val response = getResponse(true)
    when (response) {
        is SUCCESS -> println(response.product)
        is FAILURE -> print(response.error)
    }


}

