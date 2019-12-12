package Java2Kotlin.domain.owner;

import java.util.List;

public interface IOwnerRepository {

    List<Owner> all();

    Owner findById(String id);

    Owner save(Owner owner);
}
