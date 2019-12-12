package Java2Kotlin.application;

import Java2Kotlin.domain.cat.Cat;
import Java2Kotlin.domain.cat.ICatRepository;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class MemoryCatRepository implements ICatRepository {

    private Map<String, Cat> cats = new HashMap<>();

    @Override
    public List<Cat> all() {
        return new ArrayList<>(cats.values());
    }

    @Override
    public Cat findById(String id) {
        return cats.get(id);
    }

    @Override
    public Cat save(Cat cat) {
        final String id;

        if(cat.getId() == null){
            id = UUID.randomUUID().toString();
        }
        else {
            id = cat.getId();
        }

        cats.put(id, cat);
        return cat;
    }
}
