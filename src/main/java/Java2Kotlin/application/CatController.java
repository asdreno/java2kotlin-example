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
    public Cat add(@RequestBody CatUpdateRequest request){
        return catService.create(request);
    }

    @PatchMapping(value = "/cats/{id}")
    public Cat update(@PathVariable String id, @RequestBody CatUpdateRequest request){
        return catService.update(id, request);
    }
}
