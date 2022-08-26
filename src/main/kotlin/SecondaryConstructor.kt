class SecondaryConstructor ( val firstName: String) {

    var lastName: String
    val fullName: String

    init {
        println("init 1 start")
        lastName = " random surname"
        println(lastName)
        fullName = firstName.plus(" $lastName")
        println("init 1 end")
    }
    constructor(firstName2: String, lastName: String = "Test default") : this(firstName2){
        println(" constructor secondary 1")
        this.lastName = lastName
        println(lastName)
    }

    init {
        println("init 2 start")
        lastName = " random surname 12"
        println(lastName)
        println("init 2 end")
    }
}

