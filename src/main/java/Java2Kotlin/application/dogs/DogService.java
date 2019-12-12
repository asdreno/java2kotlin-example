package Java2Kotlin.application.dogs;

import Java2Kotlin.domain.dog.Dog;
import Java2Kotlin.domain.dog.IDogRepository;
import Java2Kotlin.domain.owner.IOwnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {

    private final IDogRepository dogRepository;

    private final IOwnerRepository ownerRepository;

    public DogService(IDogRepository dogRepository, IOwnerRepository ownerRepository) {
        this.dogRepository = dogRepository;
        this.ownerRepository = ownerRepository;
    }

    public List<Dog> findAll() {
        return dogRepository.all();
    }

    public Dog create(DogUpdateRequest request){
        final Dog dog = new Dog();
        dog.setLocation(request.getLocation());
        dog.setName(request.getName());
        dog.setLastFeed(request.getLastFeed());
        return dogRepository.save(dog);
    }

    public Dog update(String id, DogUpdateRequest request){
        final Dog dog = dogRepository.findById(id);
        if(dog == null){
            throw new DogNotFoundException(id);
        }
        dog.setLocation(request.getLocation());
        dog.setName(request.getName());
        dog.setLastFeed(request.getLastFeed());
        return dogRepository.save(dog);
    }
}
