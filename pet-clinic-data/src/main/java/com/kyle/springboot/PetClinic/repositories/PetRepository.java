package com.kyle.springboot.PetClinic.repositories;

import com.kyle.springboot.PetClinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
