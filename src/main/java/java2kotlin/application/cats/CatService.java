package java2kotlin.application.cats;

import java2kotlin.domain.cat.Cat;
import java2kotlin.domain.cat.ICatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {

    private final ICatRepository catRepository;

    public CatService(ICatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public List<Cat> findAll() {
        return catRepository.all();
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
