package Java2Kotlin.application.dogs;

import Java2Kotlin.domain.dog.Dog;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DogController {

    private final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping(value = "/dogs")
    public List<Dog> getDogs(){
        return dogService.findAll();
    }

    @PutMapping(value = "/dogs")
    public Dog add(@RequestBody DogUpdateRequest request){
        return dogService.create(request);
    }

    @PatchMapping(value = "/dogs/{id}")
    public Dog update(@PathVariable String id, @RequestBody DogUpdateRequest request){
        return dogService.update(id, request);
    }
}
