import java.util.*

interface IdProvider {
    fun getId() : String
}

enum class EntityType {
    HELP, EASY, MEDIUM, HARD;

    fun getFormattedName() = name.lowercase(Locale.getDefault()).capitalize()
}

//Object Declaration (Thread-safe Singletons) //Static//utility
object EntityFactory {
    fun create(type: EntityType) : Entity {
        val id = UUID.randomUUID().toString();
        val name = when(type) {
            EntityType.EASY -> "${type.name} Name"
            EntityType.MEDIUM -> "${type.getFormattedName()} Name"
            EntityType.HARD -> "Hard Name"
            EntityType.HELP ->  "${type.getFormattedName()} Name"
        }

        return when (type) {
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name,2f)
            EntityType.HELP -> Entity.Help
        }
    }
}

sealed class Entity() {
    object Help : Entity()  {
        val name = "Help"
    }

    //data classes... immutable data types...generates method automatically..hashcode..toString
    data class Easy(val id: String, val name: String): Entity()
    data class Medium(val id: String, val name: String): Entity()
    class Hard(val id: String, val name: String, val multiplier: Float): Entity()

}

//class Entity (val id: String, val name: String) {
//    companion object Factory: IdProvider {
//
//        const val id = "id"
//
//        override fun getId(): String {
//            return "123"
//        }
//
//        fun create() = Entity(getId())
//    }

//    override fun toString(): String {
//        return "id: $id , name: $name"
//    }
//}

fun main() {
    val entity: Entity = EntityFactory.create(EntityType.EASY)
    println(entity)

    val entity2 = EntityFactory.create(EntityType.MEDIUM)
    println(entity2)

    val entity3 = EntityFactory.create(EntityType.HELP)
    println(entity3)

    val msg = when(entity) {
        is Entity.Easy -> "Easy Class"
        is Entity.Hard ->"Hard Class"
        Entity.Help -> "Help Class"
        is Entity.Medium -> "Medium Class"
    }

    println(msg)

    val entity4: Entity = Entity.Easy("id", "name")
    val entity5: Entity = Entity.Easy("id", "name")

    if(entity4 == entity5){
        println("Easy Equal")
    } else {
        println("Easy Not Equal")
    }

    // Both equality
    if(entity4 === entity5){
        println("Easy Equal")
    } else {
        println("Easy Not Equal")
    }



    val entity6: Entity = Entity.Hard("id", "name", 23f)
    val entity7: Entity = Entity.Hard("id", "name", 23f)

    if(entity6 == entity7){
        println("HArd Equal")
    } else {
        println("Hard Not Equal")
    }


}