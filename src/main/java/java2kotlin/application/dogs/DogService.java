package java2kotlin.application.dogs;

import java2kotlin.domain.dog.Dog;
import java2kotlin.domain.dog.IDogRepository;
import java2kotlin.domain.owner.IOwnerRepository;
import java2kotlin.domain.owner.Owner;
import java2kotlin.domain.shared.VaccinationType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {

    private final IDogRepository dogRepository;

    private final IOwnerRepository ownerRepository;

    public DogService(IDogRepository dogRepository, IOwnerRepository ownerRepository) {
        this.dogRepository = dogRepository;
        this.ownerRepository = ownerRepository;
    }

    public List<Dog> findAll() {
        return dogRepository.all();
    }

    public Dog create(DogUpdateRequest request){
        final String ownerId = request.getOwnerId();
        if(ownerId != null){
            final Owner owner = ownerRepository.findById(ownerId);
            if(owner.getAddress() != null && owner.getAddress().getCountry() != null){
                final VaccinationType vaccinationType = owner.getAddress().getCountry().getRequiredVaccinationType();
                if(vaccinationType == VaccinationType.TYPE_B){
                    throw new UnsupportedVaccinationTypeException(vaccinationType);
                }
            }
        }

        final Dog dog = new Dog();
        dog.setLocation(request.getLocation());
        dog.setName(request.getName());
        dog.setLastFeed(request.getLastFeed());
        return dogRepository.save(dog);
    }

    public Dog update(String id, DogUpdateRequest request){
        final Dog dog = dogRepository.findById(id);
        if(dog == null){
            throw new DogNotFoundException(id);
        }
        dog.setLocation(request.getLocation());
        dog.setName(request.getName());
        dog.setLastFeed(request.getLastFeed());
        return dogRepository.save(dog);
    }
}
