package Java2Kotlin.application.owners;

import Java2Kotlin.domain.owner.IOwnerRepository;
import Java2Kotlin.domain.owner.Owner;
import Java2Kotlin.domain.shared.Address;
import Java2Kotlin.domain.shared.Country;
import Java2Kotlin.domain.shared.VaccinationType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class FixedOwnerRepository implements IOwnerRepository {

    private HashMap<String, Owner> owners = new HashMap<>();

    public FixedOwnerRepository(){
        final Owner owner = createInitialOwner();
        owners.put(owner.getId(), owner);
    }
    @Override
    public List<Owner> all() {
        return new ArrayList<>(owners.values());
    }

    @Override
    @Nullable
    public Owner findById(String id) {
        return owners.get(id);
    }

    @Override
    public Owner save(Owner owner) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    private Owner createInitialOwner() {
        final Owner owner = new Owner();
        owner.setId("0ab3eb98-c813-4fcb-b2c5-6ed6a7458688");
        owner.setName("Max Mustermann");

        final Country country = new Country();
        country.setCountryCode("DE");
        country.setName("Germany");
        country.setRequiredVaccinationType(VaccinationType.TYPE_A);

        final Address address = new Address();
        address.setCity("Stuttgart");
        address.setPostalCode("70569");
        address.setStreet("Streetstr. 3");
        address.setCountry(country);

        owner.setAddress(address);
        return owner;
    }
}
