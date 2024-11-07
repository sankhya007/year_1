
//day 2

//fun main(args: Array<String>) {
//    println("Hello world")
//
//    val test : String = "some test"
//    println(test)
//    println(test.length)
//
//    //val text : String = null
//    //println(text)
//    //this ain't possible
//
//    val text1 : String? = null
//    println(text1)
//
//    //var text2: String? = "name"
//    //text2 = null
//    //println(text2)
//    //println(text2.length)    //ain't no way you thought this is gonna run
//
//    val text2: String? = null
//    if (text2 != null) {
//        println("the value is not null")
//    }else{
//        println("the value is null")
//    }
//
//    val test1 : String? = null
//    val test2 : String = text1 ?: "Hello world"  // this
//    //val test2 = test1   // or this
//    println("$test1 , $test2")
//
//    val statement : String? = null
//    val statement1 : String = statement ?: "Hello world"
//    // here we can see the value changing
//    println(statement1)
//
//    var statement2 : String? = null
//    statement2 = "you are a lil nigga"
//    println(statement2)
//    val statement3 : String = statement2 ?: "i'll kill you lil nigga"
//    //coz the value in that statement2 is not null before we are changing it , that's why
//    //it's going to the value we have save in the statement2 in the statement 3
//    println(statement3)
//}


//making functions

//fun main(args: Array<String>) {
//    sayHello(name = "sankhya" , age = 20)
//
//    val HasInternetConnection = false
//    if (HasInternetConnection) {
//        noInternet()
//    }else{
//        getData(data = "porn addict")
//    }
//
//    fun sayHello(name: String, age: Int){
//        var number = age
//        number = 22
//        println("Hello $name, you are $number years old.")
//    }
//
//    fun getData(data:String){
//        println("the data we have gathered od the user is : $data")
//    }
//
//    fun noInternet(){
//        println("404 error.")
//    }
//}


//fun main(args: Array<String>) {
//    val max : Int = getMax(a = 12 , b = 11 , c = 0)
//    println(max)
//}
//
//fun getMax(a : Int, b : Int): Int {
//    var max : Int = if (a > b) {
//        return a
//    }else{
//        return b
//    }
//}
//
//fun getMax(a : Double , b : Double) : Double{
//    var max : Double = if (a > b) {
//        return a
//    }else{
//        return b
//    }
//}
//
//fun getMax(a : Int, b : Int, c: Int) : Int{
//    var max : Int = if (a >= b && a >= c) {
//        return a
//    }else if(b >= a && b >= c){
//        return b
//    }else{
//        return c
//    }
//}


//fun main(args: Array<String>) {
//    println(sum(a = 12 , b = 12 , c = 12 , d = 12 ))
//    println("here is the addition of the giver numbers")
//}
//
//fun sum(a:Int, b:Int, c:Int, d:Int):Int{
//    return a + b + c + d
//}