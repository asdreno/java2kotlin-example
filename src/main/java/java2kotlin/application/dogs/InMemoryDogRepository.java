package java2kotlin.application.dogs;

import java2kotlin.domain.dog.Dog;
import java2kotlin.domain.dog.IDogRepository;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
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