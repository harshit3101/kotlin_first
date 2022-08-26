const val temp = 3;

var temp2: String? = null;

var temp3: String ?= "twew";

fun main() {
    println("Hello World!")

    val myName: String = "Harshit"

//    myName = "akshit"

    var myName2 = "Harshit garg"

    println(myName)

    println(myName2)

    myName2 = "Bahubali"

    println(myName2)


    println(temp)

    println(temp2?:2)

//    temp2!!

    var greeting: String? = null

    if(greeting != null) {
        println(greeting)

        greeting = "If string"
    } else{
        println("Hsa")

        greeting = "else String"
    }


    when(greeting) {
        null -> println("first")
        "else String" -> println("Awesome!!")
//        5 -> println("More Awesome!!") compile error
        else -> println("Hsa2")
    }

    println(greeting)
}