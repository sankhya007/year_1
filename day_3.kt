
//day 3

//fun main(args: Array<String>) {
//    println("Hello world")
//}


//fun main(args: Array<String>) {
//    println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9))
//}
//fun sum(vararg numebrs : Int): Int {
//    var result = 0
//    for (num in numebrs) {
//        result += num
//    }
//
//    return result
//}


//fun main(args: Array<String>) {
//
//    for (i in 1..10) {
//        println(i)
//    }
//
//    for (i in 1..10 step 2) {
//        println(i)
//    }
//
//    for (i in 1..10) {
//        // putting "until" instead of .. does also work
//        println(i)
//    }
//     for(i in 10 downTo 1) {
//         println(i)
//     }
//}


//fun main(args: Array<String>) {
//    var number = 0
//    while(number <= 10) {
//        println("$number")
//        number++
//    }

//    var number = 0
//    while(number < 10) {
//        number++
//        if(number % 2 == 0){
//            continue
//        }
//        println("$number")
//    }
//}


//fun main(args: Array<String>) {
//    for (i in 1..10) {
//        if (i in 3..8){
//            continue
//        }
//        println(i)
//    }
//}


//fun main(args: Array<String>) {
//    var number = 0
//
//    while(number < 10) {
//        if(number == 8) {
//            break
//        }
//        number++
//        println("$number")
//    }
//}


//fun main(args: Array<String>) {
//    for (i in 1..10) {
//        println("$i")
//
//        for (j in 1..10) {
//            println("***$j")
//        }
//    }
//}


//fun main(args: Array<String>) {
//    var number = 0
//
//    while (number < 10) {
//        number++
//        println(number)
//
//        var num = 10
//
//        while (num > 0) {
//            num--
//            println("***$num")
//        }
//    }
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
//
////    outer@for (i in 1..10) {
////        println("the number is : $i")
////
////        for (j in 1..10) {
////            if (j == 7) {
////                break@outer
////            }
////            println("***$j")
////        }
////    }
//}
