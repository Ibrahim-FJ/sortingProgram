fun main (){
    println("Please Enter three number to sort them from the smallest to the biggest")
    val number1 = readLine()!!.toFloat()
    val number2 = readLine()!!.toFloat()
    val number3 = readLine()!!.toFloat()


        val smallest = getSmallest(number1, number2, number3)
        val biggest = getBiggest(number1, number2, number3)
        val mid = getMid(number1, number2, number3, smallest, biggest)

        println("$smallest\n $mid\n $biggest")

}

fun getSmallest(number1 : Float, number2 : Float, number3: Float) : Float{
    var smallest : Float = number1
    if (smallest > number2){
        smallest = number2
    }
    if (smallest >= number3){
        smallest = number3
    }

   return smallest
}

fun getBiggest(number1 : Float, number2 : Float, number3: Float) : Float{
    var biggest : Float = number1

    if(biggest < number2){
        biggest = number2
    }
    if(biggest <= number3){
        biggest = number3
    }
    return biggest

}

fun getMid(number1 : Float, number2 : Float, number3: Float, smallest : Float, biggest : Float) : Float{
    var mid : Float ?= null
    if (number1 < biggest && number1 > smallest){
        mid = number1
    }else if (number2 < biggest && number2 > smallest){
        mid = number2
    }else{
        mid = number3
    }
    return mid
}