package Java2Kotlin.domain.dog;

import java.util.List;

public interface IDogRepository {

    List<Dog> all();

    void save(Dog dog);
}
