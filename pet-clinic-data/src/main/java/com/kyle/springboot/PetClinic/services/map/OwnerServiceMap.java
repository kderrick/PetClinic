package com.kyle.springboot.PetClinic.services.map;

import com.kyle.springboot.PetClinic.model.Owner;
import com.kyle.springboot.PetClinic.model.Pet;
import com.kyle.springboot.PetClinic.services.OwnerService;
import com.kyle.springboot.PetClinic.services.PetService;
import com.kyle.springboot.PetClinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petServie;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petServie) {
        this.petTypeService = petTypeService;
        this.petServie = petServie;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {

        if(object != null) {
            if(object.getPets() != null) {
                object.getPets().forEach(pet ->{
                    if(pet.getPetType() != null) {
                        if(pet.getPetType().getId() == null) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }

                    } else {
                        throw new RuntimeException("Pet Type is required");
                    }

                    if(pet.getId() == null) {
                        Pet savedPet = petServie.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);

        } else {
            return null;

        }
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
