

fun printFilteredStrings(list: List<String>, predicate: (String) -> Boolean) {
    list.forEach{
        if(predicate(it)){
            println(it)
        }
    }
}

fun main() {
    val list = listOf("Java", "C++", "Kotlin")
    printFilteredStrings(list) { it -> it.startsWith("K") }
}