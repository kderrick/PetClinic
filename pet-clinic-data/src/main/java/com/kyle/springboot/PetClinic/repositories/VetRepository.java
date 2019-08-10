package com.kyle.springboot.PetClinic.repositories;

import com.kyle.springboot.PetClinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
