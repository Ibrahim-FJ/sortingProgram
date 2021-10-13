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
