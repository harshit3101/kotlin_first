fun getGreeting(): String {
    return "Namaste Duniya!!"
}

var temp4: String? = null

fun getGreeting2() = "Namaste Duniya Dobara!!"

fun getGreeting3() = temp4!!

fun test() {

}

fun test2() : Unit {

}

fun main() {
    println("Hello world again !!")

    println(getGreeting())

    println(getGreeting2())

//    println(getGreeting3())


}