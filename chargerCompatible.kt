package com.general.kotlin.demo


//  1,2,3
//

private fun whenTest(phoneName: String, model: Int) =
        when (phoneName) {

    "SAMSUNG" ->
        when (model) {
            in 1..3 -> "USB"
            4 -> "USB-C TYPE"
            else -> "UNKNWON"
        }
    "IPHONE" -> "APPLE ONLY"
    "ONEPLUS" -> "USB-C CYPE"
    else -> "UNKNOWN"
}
