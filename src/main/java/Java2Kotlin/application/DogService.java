package Java2Kotlin.application;

import Java2Kotlin.domain.dog.Dog;
import Java2Kotlin.domain.dog.IDogRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DogService {

    private final IDogRepository dogRepository;

    public DogService(IDogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public List<Dog> findAll() {
        return new ArrayList<>();
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
