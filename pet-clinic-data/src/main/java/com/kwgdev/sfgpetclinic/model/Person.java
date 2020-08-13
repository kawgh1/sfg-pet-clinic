package com.kwgdev.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * created by kw on 7/31/2020 @ 3:02 PM
 */
@MappedSuperclass
// tells JPA this is a base class and other classes will be inheriting from it, so don't map it to the database
public class Person extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
