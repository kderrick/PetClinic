package com.kyle.springboot.PetClinic.repositories;

import com.kyle.springboot.PetClinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
