
interface MyFirstInterface {
    val implName: String
    fun runFirst(text: String);

    fun printInfo(person1: Person1) {
        println("$implName Printing person $person1")
        person1.printInfo()
    }
}


fun main(){
    var firstInterface = object: MyFirstInterface {
        override val implName: String
            get() = "Object exp impl"

        override fun runFirst(text: String) {
            println("Text printing $text")
        }

    }

    firstInterface.runFirst("Random")

    firstInterface.printInfo(Person1(_firstname = "Harshit", _lastName = "garg"))
}

open class FirstInterfaceImpl : MyFirstInterface {
    var tet: String ="";

    override val implName: String
        get(): String {
            return "FirstInterfaceImpl"
        }

    override fun runFirst(text: String) {
       println("Text printing $text")
    }
}