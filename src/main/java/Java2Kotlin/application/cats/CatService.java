package Java2Kotlin.application.cats;

import Java2Kotlin.domain.cat.Cat;
import Java2Kotlin.domain.cat.ICatRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatService {

    private final ICatRepository catRepository;

    public CatService(ICatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public List<Cat> findAll() {
        return new ArrayList<>();
    }

    public Cat create(CatUpdateRequest request){
        final Cat cat = new Cat();
        cat.setLocation(request.getLocation());
        cat.setName(request.getName());
        cat.setLastFeed(request.getLastFeed());
        return catRepository.save(cat);
    }

    public Cat update(String id, CatUpdateRequest request){
        final Cat cat = catRepository.findById(id);
        if(cat == null){
            throw new CatNotFoundException(id);
        }
        cat.setLocation(request.getLocation());
        cat.setName(request.getName());
        cat.setLastFeed(request.getLastFeed());
        return catRepository.save(cat);
    }
}
