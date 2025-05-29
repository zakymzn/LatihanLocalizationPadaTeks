package com.dicoding.picodiploma.productdetail

import java.text.NumberFormat

object Helper {
    fun String.withNumberingFormat(): String {
        return NumberFormat.getNumberInstance().format(this.toDouble())
    }
}