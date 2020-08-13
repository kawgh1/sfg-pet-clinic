package com.kwgdev.sfgpetclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * created by kw on 8/2/2020 @ 8:54 PM
 */
@MappedSuperclass // tells JPA this is a base class and other classes will be inheriting from it, so don't map it to the database
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Hibernate prefers to use Box type (Long vs long) because Box types can't be null

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
