

fun main() {
    var names = arrayOf("Ram", "Sham", "Mohan");

    println(names.toString())
    println(names.size)
    println(names.get(0))
    println(names[0])

    println("--------")

    for (name in names){
        println("Name now $name")
    }

    println("--------")

    names.forEach {
        println("in forEach $it")
    }

    println("--------")

    names.forEach { name ->
        println("in forEach $name");
        println("Iteration finish for $name")
    }

    println("--------")

    names.forEachIndexed { index, name ->
        println( "$index Inside forEach $name");
    }

    var nameMap = mapOf(0 to "Ram", 1 to "Sham", 2 to "Mohan")

    nameMap.forEach { key, value ->
        println("$key Inside Map $value");
    }

    greetAll(listOf("Ram", "Sham", "Mohan"))

}

fun greetAll(names: List<String>) {
    names.forEach { name ->
        println("Namaste $name!!");
    }
}