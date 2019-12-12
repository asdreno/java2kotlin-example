package Java2Kotlin.application.dogs;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class DogNotFoundException extends RuntimeException {
    public DogNotFoundException(String id) {
        super("Cat with id " + id + " not found");
    }
}
