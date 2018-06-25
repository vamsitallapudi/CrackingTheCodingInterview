package chapter1

fun main(args: Array<String>) {
    val str = readLine()!!
    if(isUniqueChars(str)){
        println("string $str has unique characters")
    } else {
        println("string $str does not have unique characters")
    }
}

fun isUniqueChars(str: String):Boolean {
    if(str.length>128){
        return false
    }
    val charSet = BooleanArray(128)
    for(i in 0 until str.length){
        val charAtI = str[i]
        if(charSet[charAtI.toInt()]){
            return false
        }
        charSet[charAtI.toInt()] = true
    }
    return true
}
