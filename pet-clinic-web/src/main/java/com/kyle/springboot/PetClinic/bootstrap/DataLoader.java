package com.kyle.springboot.PetClinic.bootstrap;

import com.kyle.springboot.PetClinic.model.*;
import com.kyle.springboot.PetClinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;
    private final VisitService visitService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService, VisitService visitService) {


        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        if(count == 0) {
            loadData();
        }



    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        Specialty  savedRadiology = specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        surgery.setDescription("Surgery");
        Specialty  savedSurgery = specialtyService.save(surgery);

        Specialty dentistry = new Specialty();
        dentistry.setDescription("Dentistry");
        Specialty  savedDentistry = specialtyService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Jojo");
        owner1.setLastName("Johnson");
        owner1.setAddress("123 Fun Street");
        owner1.setCity("Jamestown");
        owner1.setTelephone("123-456-7890");

        Pet jojoPet = new Pet();
        jojoPet.setName("Rex");
        jojoPet.setPetType(savedDogPetType);
        jojoPet.setOwner(owner1);
        jojoPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(jojoPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Tom");
        owner2.setLastName("Thingville");
        owner2.setAddress("123 Party Ave");
        owner2.setCity("Smithville");
        owner2.setTelephone("098-765-4321");

        Pet tomPet = new Pet();
        tomPet.setName("Rosco");
        tomPet.setBirthDate(LocalDate.now());
        tomPet.setOwner(owner2);
        tomPet.setPetType(savedCatPetType);
        owner2.getPets().add(tomPet);

        ownerService.save(owner2);
        Visit catVisit = new Visit();
        catVisit.setPet(tomPet);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Sneezy kitty");
        visitService.save(catVisit);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Mark");
        vet1.setLastName("Morning");
        vet1.getSpecialties().add(savedSurgery);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Marty");
        vet2.setLastName("Smith");
        vet2.getSpecialties().add(savedDentistry);

        vetService.save(vet2);

        System.out.println("Vets Loaded");
    }
}
