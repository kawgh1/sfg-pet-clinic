package com.kwgdev.sfgpetclinic.model;

import java.util.Set;

/**
 * created by kw on 7/31/2020 @ 3:03 PM
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
