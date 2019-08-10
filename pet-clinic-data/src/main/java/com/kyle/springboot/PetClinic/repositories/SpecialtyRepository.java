package com.kyle.springboot.PetClinic.repositories;

import com.kyle.springboot.PetClinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
