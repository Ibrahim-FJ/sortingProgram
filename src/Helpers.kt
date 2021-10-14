
fun sort(number1: Float, number2: Float, number3: Float){

    println("Enter 1 letter or 2 letter to use which function")
    val easyMid = readLine()!!.toInt()
    val smallest = getSmallest(number1, number2, number3)
    val biggest = getBiggest(number1, number2, number3)

    if (easyMid == 1) {

        val mid = getMid1(number1, number2, number3)
        println("Mid from 1st mid\n$smallest\n$mid\n$biggest")
    }else if(easyMid == 2){

        val mid = getMid2(number1, number2, number3)
        println("Mid from 2nd mid\n$smallest\n$mid\n$biggest")
    }else{
        println("Wrong Input")
    }


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

fun getMid1(number1 : Float, number2 : Float, number3: Float) : Float{

    val smallest = getSmallest(number1, number2, number3)
    val biggest = getBiggest(number1, number2,number3 )

    val mid = if (number1 < biggest && number1 > smallest){
        number1
    }else if (number2 < biggest && number2 > smallest){
        number2
    }else{
        number3
    }
    return mid
}
fun getMid2 (number1 : Float, number2 : Float, number3: Float) : Float{
 val smallest = getSmallest(number1, number2, number3)
    val biggest = getBiggest(number1, number2,number3 )

   // var mid : Float ?= null
    val mid = if (number1 < biggest && number1 > smallest){
        number1
    }else if (number2 < biggest && number2 > smallest){
        number2
    }else{
        number3
    }
    return mid
}
