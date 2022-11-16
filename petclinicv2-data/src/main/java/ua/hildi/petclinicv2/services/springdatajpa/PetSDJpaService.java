package ua.hildi.petclinicv2.services.springdatajpa;

import org.springframework.stereotype.Service;
import ua.hildi.petclinicv2.model.Pet;
import ua.hildi.petclinicv2.repositories.PetRepository;
import ua.hildi.petclinicv2.services.PetService;

import java.util.List;

@Service
public class PetSDJpaService implements PetService {

    private final PetRepository petRepository;

    public PetSDJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}