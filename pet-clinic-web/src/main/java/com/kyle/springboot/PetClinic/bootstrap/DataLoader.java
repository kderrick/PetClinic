package com.kyle.springboot.PetClinic.bootstrap;

import com.kyle.springboot.PetClinic.Owner;
import com.kyle.springboot.PetClinic.Vet;
import com.kyle.springboot.PetClinic.services.OwnerService;
import com.kyle.springboot.PetClinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {


        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Jojo");
        owner1.setLastName("Johnson");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Tom");
        owner2.setLastName("Thingville");

        ownerService.save(owner2);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Mark");
        vet1.setLastName("Morning");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Marty");
        vet2.setLastName("Smith");

        vetService.save(vet2);

        System.out.println("Vets Loaded");


    }
}
