package java2kotlin.domain.cat;

import java.util.List;

public interface ICatRepository {

    List<Cat> all();

    Cat findById(String id);

    Cat save(Cat cat);
}
