package Java2Kotlin.domain.dog;

import java.util.List;

public interface IDogRepository {

    List<Dog> all();

    Dog findById(String id);

    Dog save(Dog cat);
}
