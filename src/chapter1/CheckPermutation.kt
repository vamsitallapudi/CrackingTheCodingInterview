package chapter1

import java.util.*

fun main(args: Array<String>) {
    sort("vamsi")
}

fun sort(str:String) {
    val y = str.toCharArray()
    Arrays.sort(y)
    println(y)
}