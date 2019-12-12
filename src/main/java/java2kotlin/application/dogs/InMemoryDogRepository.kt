package java2kotlin.application.dogs

import java2kotlin.domain.dog.Dog
import java2kotlin.domain.dog.IDogRepository
import org.springframework.stereotype.Component
import java.util.HashMap
import java.util.UUID

@Component
class InMemoryDogRepository : IDogRepository {
    private val dogs: MutableMap<String, Dog> = HashMap()

    override fun all(): List<Dog> = dogs.values.toList()

    override fun findById(id: String): Dog? = dogs[id]

    override fun save(dog: Dog): Dog {
        val id: String = if (dog.id == null) {
            UUID.randomUUID().toString()
        } else {
            dog.id
        }
        dog.id = id
        dogs[id] = dog
        return dog
    }
}
