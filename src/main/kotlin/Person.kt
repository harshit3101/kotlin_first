class Person1 (_firstname: String, _lastName: String) {
    val firstName: String
    val lastName: String = _lastName
    var nickName: String? = null
        set(value) {
            println("NickName old $field")
            field = value
            println("NickName new $field")
        }

    init {
        firstName = _firstname
    }

    fun printInfo() {
        val nickName = nickName?:"no NockName"
        println("$firstName $lastName 's nickname is $nickName")
    }
}

class Person2 (val firstname: String, _lastName: String) {
    val lastName: String = _lastName
    val fullName: String = firstname.plus(" $_lastName")
}