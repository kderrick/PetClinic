package com.kyle.springboot.PetClinic.controllers;

import com.kyle.springboot.PetClinic.model.Owner;
import com.kyle.springboot.PetClinic.services.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {
    @Mock
    OwnerService ownerService;

    @InjectMocks
    OwnerController controller;

    Set<Owner> owners;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
      owners  = new HashSet<>();
      owners.add(Owner.builder().id(1L).build());
      owners.add(Owner.builder().id(2L).build());


      mockMvc = MockMvcBuilders
              .standaloneSetup(controller)
              .build();
    }

    @Test
    void listOwners() {
    }

    @Test
    void findOwners() {
    }
}