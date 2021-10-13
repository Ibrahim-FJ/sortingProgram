fun main (){
    println("Please Enter three number to sort them from the smallest to the biggest")
    var number1 = readLine()!!.toFloat()
    var number2 = readLine()!!.toFloat()
    var number3 = readLine()!!.toFloat()

    var smallest : Float = number1
    var biggest : Float = number1
    var mid : Float ?= null


    if (smallest > number2){
        smallest = number2
    }
    if (smallest >= number3){
        smallest = number3
    }


    if(biggest < number2){
        biggest = number2
    }
    if(biggest <= number3){
        biggest = number3
    }

    if (number1 < biggest && number1 > smallest){
        mid = number1
    }else if (number2 < biggest && number2 > smallest){
        mid = number2
    }else{
        mid = number3
    }

println("$smallest\n $mid\n $biggest")

}