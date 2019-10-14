package com.kyle.springboot.PetClinic.services.map;

import com.kyle.springboot.PetClinic.model.Pet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetMapServiceTest {
    PetMapService petMapService;
    @BeforeEach
    void setUp() {
        petMapService = new PetMapService();
        //petMapService.save(Pet.builder().owner().petType().name().birthDate())
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}