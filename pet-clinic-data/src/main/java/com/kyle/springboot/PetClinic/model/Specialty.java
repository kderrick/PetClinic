package com.kyle.springboot.PetClinic.model;

import com.kyle.springboot.PetClinic.model.BaseEntity;

public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
