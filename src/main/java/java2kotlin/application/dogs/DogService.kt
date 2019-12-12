package java2kotlin.application.dogs

import java2kotlin.domain.dog.Dog
import java2kotlin.domain.dog.IDogRepository
import java2kotlin.domain.owner.IOwnerRepository
import java2kotlin.domain.shared.VaccinationType
import org.springframework.stereotype.Service

@Service
class DogService(
    private val dogRepository: IDogRepository,
    private val ownerRepository: IOwnerRepository
) {

    fun findAll() = dogRepository.all()

    fun create(request: DogUpdateRequest): Dog {
        request.ownerId?.let {
            val foundType = ownerRepository.findById(it)?.address?.country?.requiredVaccinationType
            if(foundType == VaccinationType.TYPE_B){
                throw UnsupportedVaccinationTypeException(foundType)
            }
        }

        val dog = Dog().apply {
            this.location = request.location
            this.name = request.name
            this.lastFeed = request.lastFeed
        }
        return dogRepository.save(dog)
    }

    fun update(id: String?, request: DogUpdateRequest): Dog {
        val dog = dogRepository.findById(id) ?: throw DogNotFoundException(id)
        dog.location = request.location
        dog.name = request.name
        dog.lastFeed = request.lastFeed
        return dogRepository.save(dog)
    }

}
