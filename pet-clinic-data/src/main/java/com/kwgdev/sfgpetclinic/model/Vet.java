package com.kwgdev.sfgpetclinic.model;

import java.util.Set;

/**
 * created by kw on 7/31/2020 @ 3:02 PM
 */
public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
