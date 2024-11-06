fun main (args : Array<String>){
    println("Hello world")

    var name : String = "sankhya"
    println("Hello $name")
    name = "jhilam"
    println("Hello $name")

    var age : Int = 12
    println("Hello $age")
    age = 23
    println("Hello $age")

    var maxintegervalue : Int = Int.MAX_VALUE
    println("Hello $maxintegervalue")
    var minintegervalue : Int = Int.MIN_VALUE
    println("Hello $minintegervalue")

    val maxbytevalue : Byte = Byte.MAX_VALUE
    println("Hello $maxbytevalue")
    val minbytevalue : Byte = Byte.MIN_VALUE
    println("Hello $minbytevalue")

    val maxshortvalue : Short = Short.MIN_VALUE
    println("Hello $maxshortvalue")
    val minshortvalue : Short = Short.MIN_VALUE
    println("Hello $minshortvalue")

    val maxlongvalue : Long = Long.MIN_VALUE
    println("Hello $maxlongvalue")
    val minlongvalue : Long = Long.MIN_VALUE
    println("Hello $minlongvalue")

    val maxdoublevalue : Double = Double.MAX_VALUE
    println("Hello $maxdoublevalue")
    val mindoublevalue : Double = Double.MIN_VALUE
    println("Hello $mindoublevalue")

    val maxfloatvalue : Float = Float.MIN_VALUE
    println("Hello $maxfloatvalue")
    val minfloatvalue : Float = Float.MIN_VALUE
    println("Hello $minfloatvalue")

    val myFloatNumber : Float = 2.1F
    println("Hello $myFloatNumber")
    val myBooleanValue : Boolean = true
    println("Hello $myBooleanValue")
    val myStringValue : String = "Hello World"
    println("Hello $myStringValue")
    val myCharacterValue : Char = 'c'
    println("Hello $myCharacterValue")

    var x = 10
    var y = 23

    println("Hello $x")
    println("Hello $y")

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")

    println("the preincrement value of x is : ${++x}")
    println("the value of x is : $x")
    println("the predecrement value of x is : ${--x}")
    println("the value of x is : $x")

    println("the preincrement value of y is : ${--y}")
    println("the value of x is : $y")
    println("the predecrement value of y is : ${--y}")
    println("the value of x is : $y")

    //same for post increment and decrement as well

    var value = 3

    value += 2
    println("The value of number is $value")

    value -= 2
    println("The value of number is $value")

    value *= 2
    println("The value of number is $value")

    value /= 2
    println("The value of number is $value")

    value %= 2
    println("The value of number is $value")

    val myStatement = false
    if (myStatement == true) {
        println("myStatement is true")
    }else{
        println("myStatement is not true")
    }

    val myNumber = 99
    if (myNumber == 100) {
        println("myNumber is 100")
    }
    else if (myNumber >= 100) {
        println("myNumber is greater than 100")
    }
    else if (myNumber <= 100) {
        println("myNumber is less than 100")
    }
    else{
        println("myNumber is invald. ")
    }

    val alarm = 7
    when(alarm){
        in 1..12 -> println("alarm is in the range")
        in 13..24 -> println("alarm is not in the range")
        12 -> println("alarm is 12")
        10 -> println("alarm is 10")
        7 -> println("alarm is 1290")
        12,14,17 -> println("alarm is $alarm")

    }

    val text = when{
        alarm == 12 -> "the value of the alarm is 12"
        alarm < 12 -> "the value of the alarm is smaller than 12"
        alarm > 12 -> "the value of the alarm is larger than 12"
        else -> {"fuck you"}
    }
}