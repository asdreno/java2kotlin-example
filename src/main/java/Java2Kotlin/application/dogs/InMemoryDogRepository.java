package Java2Kotlin.application.dogs;

import Java2Kotlin.domain.dog.Dog;
import Java2Kotlin.domain.dog.IDogRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InMemoryDogRepository implements IDogRepository {

    private Map<String, Dog> dogs = new HashMap<>();

    @Override
    public List<Dog> all() {
        return new ArrayList<>(dogs.values());
    }

    @Override
    public Dog findById(String id) {
        return dogs.get(id);
    }

    @Override
    public Dog save(Dog dog) {
        final String id;

        if(dog.getId() == null){
            id = UUID.randomUUID().toString();
        }
        else {
            id = dog.getId();
        }

        dog.setId(id);
        dogs.put(id, dog);
        return dog;
    }
}
