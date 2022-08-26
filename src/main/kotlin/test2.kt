
fun sayHello( name: String){
    val msg = "Namaste ".plus(name);

    val msg2 = "With String templates: Namaste  $name"

    println(msg)
    println(msg2)
}

fun sayHello2(name: String) = println(name)

fun main() {
    sayHello("Harshit")
    sayHello2("test")
}