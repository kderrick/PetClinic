package com.kyle.springboot.PetClinic.repositories;

import com.kyle.springboot.PetClinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
