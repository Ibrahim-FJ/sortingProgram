
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