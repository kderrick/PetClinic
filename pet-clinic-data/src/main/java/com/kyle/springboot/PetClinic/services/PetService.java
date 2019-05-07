package com.kyle.springboot.PetClinic.services;

import com.kyle.springboot.PetClinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
