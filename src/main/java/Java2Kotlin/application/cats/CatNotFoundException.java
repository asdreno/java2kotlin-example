package Java2Kotlin.application.cats;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CatNotFoundException extends RuntimeException {
    public CatNotFoundException(String id) {
        super("Cat with id " + id + " not found");
    }
}
