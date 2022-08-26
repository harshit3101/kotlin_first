fun main() {
    val secondaryConstructor1 = SecondaryConstructor(firstName2 = "Harshit", lastName = "Garg")

    println(secondaryConstructor1.firstName)
    println(secondaryConstructor1.lastName)
    println(secondaryConstructor1.fullName)

    println(" ------------ test 2-------------")

    val secondaryConstructor2 = SecondaryConstructor(firstName = "Harshit")

    println(secondaryConstructor2.firstName)
    println(secondaryConstructor2.lastName)
    println(secondaryConstructor2.fullName)

    println(" ------------ test 3-------------")

    val secondaryConstructor3 = SecondaryConstructor(firstName2 = "Harshit")

    println(secondaryConstructor3.firstName)
    println(secondaryConstructor3.lastName)
    println(secondaryConstructor3.fullName)
}
