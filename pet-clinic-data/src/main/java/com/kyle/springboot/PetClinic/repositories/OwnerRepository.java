package com.kyle.springboot.PetClinic.repositories;

import com.kyle.springboot.PetClinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
