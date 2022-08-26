

fun main() {
    var firstKotlinClass = FirstKotlinClass("name")

    var firstKotlinClass2 = FirstKotlinClass2()

    var firstKotlinClass3_1 = FirstKotlinClass3()

    var firstKotlinClass3_2 = FirstKotlinClass3("name")

    var person1 = Person1(_firstname = "Harshit", _lastName = "garg")

    println(person1.firstName)
    println(person1.lastName)
    person1.printInfo()

    person1.nickName = "champu"
    person1.nickName = "champu 2"

    person1.printInfo()

    var person2 = Person2(firstname = "Harshit", _lastName = "garg")

    println(person2.firstname)
    println(person2.lastName)
    println(person2.fullName)

}