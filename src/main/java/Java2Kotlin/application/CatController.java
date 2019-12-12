package Java2Kotlin.application;

import Java2Kotlin.domain.cat.Cat;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CatController {

    private final CatService catService;

    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping(value = "/cats")
    public List<Cat> getCats(){
        return catService.findAll();
    }

    @PutMapping(value = "/cats")
    public Cat add(Cat cat, @RequestBody CatUpdateRequest request){
        return catService.create(request);
    }

    @PostMapping(value = "/cats/{id}/feed")
    public List<Cat> feed(@PathVariable String id){
        return catService.findAll();
    }
}
