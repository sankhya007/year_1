//day4

//fun main(args: Array<String>) {
//    println("Hello world")
//}


//fun main(args: Array<String>) {
//    var number = 0
//    outer@while(number < 10) {
//        number ++
//        println("Number is $number")
//
//        var i = 0
//
//        while (i < 10) {
//            if (i == 7){
//                break@outer
//            }
//            i++
//            println("***$i")
//        }
//    }

//    outer@for (i in 1..10) {
//        println("the number is : $i")
//
//        for (j in 1..10) {
//            if (j == 7) {
//                break@outer
//            }
//            println("***$j")
//        }
//    }
//}


//fun main(args: Array<String>) {
//
//    var number = 0
//    val endingNumber = 20
//    var evenNUmberCounter = 0
//
//    while (number <= endingNumber){
//        number++
//
//        if (!isEvenNumber(number)){
//            continue
//        }
//        evenNUmberCounter++
//        println(number)
//
//    }
//    println("the number of even number in the list is : $evenNUmberCounter")
//}
//
//fun isEvenNumber(number: Int): Boolean {
//    if (number % 2 == 0) {
//        return true
//    }else{
//        return false
//    }
//}


//fun main(args: Array<String>) {
//
//    var evenNumberCounter = 0
//    for (i in 1..10) {
//        if(!isEvenNumber(i)){
//            continue
//        }
//        evenNumberCounter++
//        println("the even number is : $i")
//    }
//    println("the number of even number we have in the list : $evenNumberCounter")
//}
//
//fun isEvenNumber(num: Int): Boolean {
//    if (num % 2 == 0) {
//        return true
//    }else{
//        return false
//    }
//
//}


//fun main(args: Array<String>) {
//
//    var evenNumberCounter = 0
//    for (i in 1..10) {
//        if (i % 2 == 0){
//            evenNumberCounter++
//        }
//    }
//    println("the number of even number in the list is : $evenNumberCounter")
//}


//fun main(args: Array<String>) {
//
//    val names = arrayOf("Michael", "John", "James", "Joe")
//    names[0] = "sankhya"
//    println(names)
//    println("second element : ${names[1]}")
//    println("the size of the array is: ${names.size}")
//    for (name in names) {
//        println(name)
//    }
//    println("you meant to have a gap in between part 1")
//    val mix = arrayOf("Michael", "John", "James", "Joe" , 2 , 3 , 4 , 5 , 6 , 7 , 1.2 , 1.3 , 1.4)
//    for (name in mix) {
//        println(name)
//    }
//    println("you meant to have a gap in between part 2")
//    for (name1  in mix) {
//        if (name1 is String) {
//            println(name1)
//        }
//    }
//    println("you meant to have a gap in between part 3")
//    for (name2 in mix) {
//        if (name2 is Int) {
//            println(name2)
//        }
//    }
//}


//fun main(args: Array<String>) {
//
//    val max = maxNumber(arrayOf(1,2,3,4,5,6,7,8))
//    val min = minNumber(arrayOf(1,2,3,4,5,6,7,8))
//    println("the max value is $max")
//    println("the min value is $min")
//
//}
//
//fun maxNumber(numbers : Array<Int>) : Int {
//    var max = numbers[0]
//
//    for(number in numbers){
//        if(number > max){
//            max = number
//        }
//    }
//    return max
//}
//
//fun minNumber(numbers : Array<Int>) : Int {
//    var min = numbers[0]
//
//    for(number in numbers){
//        if(number < min){
//            min = number
//        }
//    }
//    return min
//}


//fun main(args: Array<String>) {
//
//    val max = findMinMaxNumber(arrayOf(1,2,3,4,5,6,7,8), true)
//    val min = findMinMaxNumber(arrayOf(1,2,3,4,5,6,7,8), false)
//    println("the max value is $max")
//    println("the min value is $min")
//
//}
//
//fun findMinMaxNumber(numbers: Array<Int>, searchMax: Boolean): Int {
//    var max = numbers[0]
//    var min = numbers[3]//you can just do whatever the fuck you want while inputting these numbers
//    if (searchMax) {
//        for (number in numbers) {
//            if (number > max) {
//                max = number
//            }
//        }
//        return max
//    }else{
//        for (number in numbers) {
//            if (number < min) {
//                min = number
//            }
//        }
//        return min
//    }
//}


//fun main(args: Array<String>) {
//
//    val Car1 = Car()
//    Car1.name = "ferrari"
//    Car1.model = "la ferrari"
//    Car1.colour = "red with black slid"
//    Car1.doors = 2
//
//    println("the name of the car is ${Car1.name}")
//    println("the model of the car is ${Car1.model}")
//    println("the colour of the car is ${Car1.colour}")
//    println("the number of the doors is has : ${Car1.doors}")
//
//    Car1.move()
//    Car1.stop()
//
//    val Car2 = Car()
//    Car2.name = "porsche"
//    Car2.model = "gt3 rs"
//    Car2.colour = "flower based pink"
//    Car2.doors = 2
//
//    println("the name of the car is ${Car2.name}")
//    println("the model of the car is ${Car2.model}")
//    println("the colour of the car is ${Car2.colour}")
//    println("the number of the doors is has : ${Car2.doors}")
//
//    Car2.move()
//    Car2.stop()
//
//}
//
//class Car{
//
//    var name = ""
//    var model = ""
//    var colour = ""
//    var doors = 0
//
//    fun move(){
//        println("the $name , $model is moving !!")
//    }
//
//    fun stop(){
//        println("the $name , $model is stopped !!")
//    }
//
//}


//fun main(args: Array<String>) {
//
//    val Car1 = Car("ferrari" , "la ferrari" , "red with black slid" , 2)
//
//    println("the name of the car is ${Car1.name}")
//    println("the model of the car is ${Car1.model}")
//    println("the colour of the car is ${Car1.colour}")
//    println("the number of the doors is has : ${Car1.doors}")
//
//    Car1.move()
//    Car1.stop()
//
//    val Car2 = Car("          porsche" , "gt3 rs" , "flower based pink" , 2)
//    //to encounter the "             " gap problem we have add a trim function in the class
//
//    println("the name of the car is ${Car2.name}")
//    println("the model of the car is ${Car2.model}")
//    println("the colour of the car is ${Car2.colour}")
//    println("the number of the doors is has : ${Car2.doors}")
//
//    Car2.move()
//    Car2.stop()
//}
//
//class Car(name: String = "", var model: String = "", var colour: String = "" , var doors: Int = 0) {
//    //and while adding that we have to remember that we can't ass the "var" to the name sting more than once so we have to do that wherever we are putting the actual function
//    var name = name.trim()
//    fun move(){
//        println("the $name , $model is moving !!")
//    }
//    fun stop(){
//        println("the $name , $model is stopped !!")
//    }
//
//}


//fun main(args: Array<String>) {
////we are putting away the class into the other kotlin file we just have created named classes
////we can store all the other classes we are making in that "classes" so that we can use them wherever in the file and keep the main file a little clean
//    val Car1 = Car()
//    Car1.name = "ferrari"
//    Car1.model = "la ferrari"
//    Car1.colour = "red with black slid"
//    Car1.doors = 2
//
//    println("the name of the car is ${Car1.name}")
//    println("the model of the car is ${Car1.model}")
//    println("the colour of the car is ${Car1.colour}")
//    println("the number of the doors is has : ${Car1.doors}")
//
//    Car1.move()
//    Car1.stop()
//
//    val Car2 = Car()
//    Car2.name = "porsche"
//    Car2.model = "gt3 rs"
//    Car2.colour = "flower baser pink"
//    Car2.doors = 2
//
//    println("the name of the car is ${Car2.name}")
//    println("the model of the car is ${Car2.model}")
//    println("the colour of the car is ${Car2.colour}")
//    println("the number of the doors it has : ${Car2.doors}")
//
//    Car2.move()
//    Car2.stop()
//
//}
