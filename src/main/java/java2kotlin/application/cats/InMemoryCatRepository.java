package java2kotlin.application.cats;

import java2kotlin.domain.cat.Cat;
import java2kotlin.domain.cat.ICatRepository;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class InMemoryCatRepository implements ICatRepository {

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

        cat.setId(id);
        cats.put(id, cat);
        return cat;
    }
}
