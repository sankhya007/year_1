//day5

//fun main(args: Array<String>) {
//    println("Hello world")
//}


//fun main(args: Array<String>) {
//    //val user1 = User ("sankhya", "dey" , 20)//this is a normal value input , we have to change it into a construstor when we don't have all the values to input in the class we just made down below
//    val user1 = User ("sankhya")
//    val user2 = User ("jhilam", "bhattacharjee" )
//    val user3 = User ("aniket", "sarkar" , 20)
//
//    println("firstname = ${user1.firstName}")
//    println("lastname = ${user1.lastName}")
//    println("age = ${user1.age}")
//
//    println("\n")
//
//    println("firstname = ${user2.firstName}")
//    println("lastname = ${user2.lastName}")
//    println("age = ${user2.age}")
//
//    println("\n")
//
//    println("firstname = ${user3.firstName}")
//    println("lastname = ${user3.lastName}")
//    println("age = ${user3.age}")
//
//    println("\n")
//}
//
//class User(var firstName: String, var lastName: String, var age: Int) {
//
//    constructor(firstName: String) : this(firstName, "surname", 0) {
//        println("passing throught the 1st constructor function in the class")
//    }
//    constructor(firstName: String, lastName: String) : this(firstName, lastName, 0) {
//        println("passing throught the 2nd constructor function in the class")
//    }
//}


//code without any companion object in the class
//fun main(args: Array<String>) {
//    val calculator = Calculator()
//    val result = calculator.sum(a = 5,b = 7)
//
//    println(result)
//
//}
//
//class Calculator(){
//    fun sum(a:Int, b:Int):Int {
//        return a+b
//    }
//}



//code with companion object in the class
//fun main(args: Array<String>) {
//    val result = Calculator.add(3,5)
//    val result2 = Calculator.sub(3,5)
//    val result3 = Calculator.multiply(3,5)
//    val result4 = Calculator.divide(6,3)
//
//    println(result)
//    println(result2)
//    println(result3)
//    println(result4)
//
//}
//
//class Calculator(){
//    companion object{
//        fun add(a:Int, b:Int): Int{
//            return a + b
//        }
//        fun sub(a:Int, b:Int): Int{
//            return a - b
//        }
//        fun multiply(a:Int, b:Int): Int{
//            return a * b
//        }
//        fun divide(a:Int, b:Int): Int{
//            return a / b
//        }
//    }
//
//}


//fun main(args: Array<String>) {
//    println("(\\(\\")
//    println("(-.-)")
//    println("0_(\")(\")")
//}


//fun main(args: Array<String>) {
//    val name = "sankhyapriyo"
//    println(name.length)
//    //going out the length of the string we have written prevously
//    println(name.capitalize())
//    //capitalizing the 1st character of the string we have saved
//    println(name.decapitalize())
//    //de-capitalizing the 1st letter of the string we have saved
//    println(name.trim())
//    //trimming any gaps there is in the given string
//    val position = name.get(3)
//    println(position)
//    //getting the exact character we have on the position given , from the saved string
//    val position_1 = name[2]
//    println(position_1)
//    //same thing as the above one but the type/usage is different
//    val position_2 = name.substring(3)
//    println(position_2)
//    //the position we age giving here , the programme will start writing the output from there
//    val position_3 = name.substring(0, 3)
//    println(position_3)
//    //here we are doing the save thing as the above one but instead of giving tjust the starting position we are ging the starting and the ending position of the output.
//
//}


//const val NAME = "google.com"
//fun main(args: Array<String>){
//    println("Hello world to all $NAME users !!")
//
//}


//fun main(args: Array<String>) {
//    println("write yo age here bitch : ")
//    val age = readlnOrNull() ?:""
//    // by using ?:"" we can avoid the nullablity and also transform the string input into a int or any other variable from string
//    println("kill yourself when your age is ${age.toInt()}!")
//}


//fun main(args: Array<String>) {
//    println("Hello world")
//    println(Random.nextInt(12,23).toString(35))
//    println(Random.nextInt())
//    println(Random.nextInt(12))
//    println(Random.nextInt(12,18))
//    println(Random.nextDouble(12.2,18.1))
//}


//fun main(args: Array<String>) {
//    println("Hello world, what is your name : ")
//    val name = readln()
//    println("hello , $name")
//}


//fun main(args: Array<String>) {
//    println("Hello world")
//    println("what is your name : ")
//    val name = readLine()
//    println("what is your birth year : ")
//    val age  = readLine()?:""
//    val yourAge = age.toInt()
//    val year = 2024 - yourAge
//    println("hello!! , $name")
//    println("you are , $year years old .")
//
//}