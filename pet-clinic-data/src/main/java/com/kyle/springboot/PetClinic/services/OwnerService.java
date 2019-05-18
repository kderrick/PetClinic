package com.kyle.springboot.PetClinic.services;

import com.kyle.springboot.PetClinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);




}
