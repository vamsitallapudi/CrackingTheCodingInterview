package chapter1

/**
 * second solution to check permutation question
 * */

fun main(args: Array<String>) {
    val str1 = readLine()!!
    val str2 = readLine()!!
    if(checkPermutation(str1,str2))
        print("valid permutation")
    else
        print("Invalid permutation")
}

fun checkPermutation(a:String,b:String): Boolean {
    if(a.length!=b.length){
        return false
    }
    val letters = IntArray(128) // assuming its normal ascii, so 128 letters in total

    for (i in a.toCharArray()){
        letters[i.toInt()]++
    }
    for (i in 0 until b.length){
        val c = b[i].toInt()
        letters[c]--
        if(letters[c]<0) {
            return false
        }
    }
    return true
}

