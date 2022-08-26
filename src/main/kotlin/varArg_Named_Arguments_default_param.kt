 fun sayHello(vararg items: String) {
    items.forEach { item ->
        println(item)
    }
}

 fun greetPerson(greet: String = "Hi", name: String) = println("$greet $name")

 fun varArg() {
     sayHello("Ram", "Sham", "Mohan")

     var names = arrayOf("Ram2", "Sham2", "Mohan2");

     println("-----")
     sayHello(*names)
 }

 fun namedArg(){
     println("-----Using Postioned Arg, Without proper order for signature - greet: String, name: String")
     greetPerson("Ram", "Hello")
     println("----- Using Named Arg, With proper order for signature - greet: String, name: String")
     greetPerson(name= "Ram", greet = "Hello")
     println("----- USing Default param, With proper order for signature - greet: String, name: String")
     greetPerson(name= "Ram")
 }


fun main() {
namedArg()
}