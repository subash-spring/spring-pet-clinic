package com.subash.petclinicdata.model;

import java.time.LocalDate;

/**
 * Created by subash on 8/25/19.
 */
public class Pet extends BaseEntity {

    private PetType petType;
    private Owner owner;
    private LocalDate birthday;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
