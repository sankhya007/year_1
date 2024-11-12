
//day6


//fun main(args: Array<String>) {
//    var price = 2.34
////the function "::class.java" is used to check the variable type
//    println(price::class.java)
//}


//fun main(args: Array<String>) {
//    println("write a integer below : ")
//    val intNum = readln()
//    val int_Num = intNum.toInt()
//    println("Write a double below : ")
//    val doubleNum = readln()
//    val double_Num = doubleNum.toDouble()
//    val multi = double_Num * int_Num
//    println("the multiplication of the numbers you entered are : $multi")
//    println("the file type of the multiplication output is : ")
//    println(multi::class.java)
//}


//fun main(args: Array<String>) {
//    println("Hello world , please enter a number : ")
//    val num = readln()
//    val numInt = num.toInt()
//    println(numInt::class.java)
//    val numLong = num.toLong()
//    println(numLong::class.java)
//    val numFloat = num.toFloat()
//    println(numFloat::class.java)
//    val numDouble = num.toDouble()
//    println(numDouble::class.java)
//    val numShort = num.toShort()
//    println(numShort::class.java)
//    val numByte = num.toByte()
//    println(numByte::class.java)
//}


//fun main(args: Array<String>) {
//    println("Hello user , enter the amount of money you have in your bank account : ")
//    val money : String = readln()?:""
//    val totalMoney = money.toInt()
//    val yearFive = totalMoney * 1.055 * 1.055 * 1.055 * 1.055 * 1.055
//    println("the amount of money user will have in his bank after 5 years is : $yearFive")
//}


//fun main(args: Array<String>) {
//    val cows = 3
//    val productiveCows = 1
//    val childrenNumber = 2
//
//    var canGetFunding = ((cows <= 5) && (productiveCows >= 1)) || ((childrenNumber + 1) > 3)
//    println("wll the farmer get the funding ? $canGetFunding")
//
//}


//fun main(args: Array<String>) {
//    var name : String? = "sankhyapriyo"
//    println("Hello $name!")
//    println(name?.substring(3,6))
//    println(name?.substring(6))
//    name = null
//    println("Hello $name!")
//}


//fun main(args: Array<String>) {
//    println("Hello world, enter a number/ integer : ")
//    val num = readln().toDouble()
//    val multi = num * 7
//    val written = multi.toString()
//    println("after multiplying by 7 the number is : $written")
//    println(written.length)
//
//}


//fun main(args: Array<String>) {
//    val name = "sankhya"
//    println("Hello $name!")
//    val name1 : String? = null
//    println("Hello $name1!")
//    println(name1?:"unable to print the name of the user.")
//    val name2: String? = null
//    println(name2?.length)
//    println(name2?:"muchu".length)
//    println(name2)
//}
//there is also a not null assertion exists so that if you enter any null value it is going to negate that value and not take it as an input and shown an error if we type that in


//fun main(args: Array<String>) {
//    println("Hello world, write your name : ")
//    val name = readln()
//    println(name?:"unable to read name")
//    println(name)
//
//    val productCost = 29.99
//    println("the prize for each of the product is : ${productCost}")
//    println("writhe the ammount of products you wanna buy : ")
//    val products = readln()
//    val productsCheck = products?.toInt()?:2
//    println("the ammount of money the user have to pay is : ${productsCheck * productCost}")
//
//}


//import java.lang.Exception
//
//fun main(args: Array<String>) {
//    println("enter a number : ")
//    val number = readLine()
//    try {
//        val inputNumber = number?.toInt()
//        println("$number * 5 = ${inputNumber?.times(5)}")
//    }catch (e: Exception) {
//        println("the input is an exception !!")
//        e.printStackTrace()
//        throw IllegalArgumentException("the function is unable to read this input , write an integer")
//    } finally {
//        println("the data you have entered have exicuted.")
//    }
//}


//import java.lang.Exception
//
//fun main(args: Array<String>) {
//    println("Hello user enter a number : ")
//    val number = readln()
//
//    try {
//        val inputNumber = number?.toInt()
//        println("Input number is $inputNumber")
//        println("$number after multiplied by 5 : ${inputNumber?.times(5)}")
//    }catch (e: Exception){
//        e.printStackTrace()
//        println("the input is a exception !!")
//        throw IllegalArgumentException("the input is not readable by the function , write an integer.")
//    }finally {
//        println("The function isn't implemented.")
//    }
//}


//import java.lang.Exception
//
//fun main(args: Array<String>) {
//    println("the products cost 9.99")
//    println("user , how many products do you want to buy : ")
//    val products = readLine()
//    try {
//        val noProducts = products?.toInt()
//        println("this is the number of products you want to buy : $noProducts")
//        println("the amount you have to pay for buying $products products is : ${noProducts?.times(9.99)}")
//    }catch (e: Exception){
//        e.printStackTrace()
//        println("the input you have given is an exception !!")
//        throw IllegalArgumentException("you should try entering a number / integer of how many products you want to buy")
//    }finally {
//        println("the code has been terminated !!")
//    }
//}


//fun main(args: Array<String>) {
//    val animal = listOf("cat" , "pussay" , "aur bada wala pussay" , "chuda hua pussay" , "binachuda hua pussay")
//    println(animal)
//    println(animal.size)
//    println(animal[1])
//    animal.get(1)
//
//    val customer_name = arrayListOf("sankhya" , "aniket" , "tiyasa")
//    println(customer_name)
//    customer_name.add("arunima")
//    customer_name.add("saura")
//    customer_name.add("pussay")
//    println(customer_name)
//    customer_name.remove("arunima")
//    customer_name.remove("saura")
//    println(customer_name)
//    println(customer_name.size)
//    println(customer_name[2])
//}


//fun main(args: Array<String>) {
//    val winners = arrayListOf("usain" , "john" , "Michel" , "Alex" , "Bob")
////    val michelPos = winners.indexOf("Michel")
////    println("the position michel plased is : ${michelPos + 1}")
//    winners.set(winners.indexOf("john"), "nigga")
//    println(winners)
//
//    val availableColours = listOf("blue" , "red")
//    val availablity = availableColours.contains("green")
//    println(availablity)
//}


//fun main(args: Array<String>) {
//
//    val winners = hashSetOf("sankhya" , "aniket" , "sankhya" , "aniket")
//    winners.add( "sankhya1")
//    println(winners)
//    val winners1 = hashSetOf("sankhya2" , "aniket1" )
//    winners.addAll(winners1)
//    println(winners1)
//    winners.remove("sankhya")
//    println(winners)
//
//    val sexoffenders = arrayListOf("male", "female", "male", "female")
//    val proSexOffenders = arrayListOf("sankhya", "arunima", "male", "female")
//    sexoffenders.addAll(proSexOffenders)
//    println(sexoffenders)
//}


//fun main(args: Array<String>) {
//    val primeNumber = setOf(2,3,5,7,11,13,17,19,23,29)
//    val check1 = primeNumber.contains(21)
//    val check2 = primeNumber.contains(13)
//    println("the number 21 exists in the prime number list $check1")
//    println("the number 13 exists in the prime number list $check2")
//
//    val myDrinks = hashSetOf("water" , "pussay juice" , "tiddy milk")
//    val theirDrinks = hashSetOf("water" , "orange juice" , "lemon juice" , "milk")
//    myDrinks.retainAll(theirDrinks)
//    println("me and my parents both likes : $myDrinks")
//}


//fun main(args: Array<String>) {
//    val mapping = mapOf(Pair(1,"one"), Pair(2,"two"), Pair(3,"three"))
//    println(mapping)
//    println(mapping.values.toList())
//    println(mapping.get(2))
//    println(mapping[3])
//    println(mapping.keys)
//    println(mapping.values)
//
//    val proMapping = hashMapOf(Pair(1,"one"), Pair(2,"two"), Pair(3,"three"))
//    println(proMapping)
//    val moreProMapping = hashMapOf(Pair(20, "twenty"), Pair(30, "thirty"))
//    proMapping.putAll(moreProMapping)
//    println(proMapping)
//    proMapping.remove(20)
//    println(proMapping)
//    proMapping.replace(30,"three zero")
//    println(proMapping)
//    proMapping.clear()
//    println(proMapping)
//
//}

