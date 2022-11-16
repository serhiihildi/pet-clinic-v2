package ua.hildi.petclinicv2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.hildi.petclinicv2.model.PetType;

@Repository
public interface PetTypeRepository extends JpaRepository<PetType, Long> {
}