package chapter1

import java.util.*

fun main(args: Array<String>) {
    val str1 = readLine()!!
    val str2 = readLine()!!
    when {
        str1.length!=str2.length -> print("Two strings are not permutations")
        sort(str1) == sort(str2) -> println("Valid permutations")
        else -> println("Permutations not valid")
    }

}

fun sort(str:String) :String {
    val y = str.toCharArray()
    Arrays.sort(y)
    return String(y)
}