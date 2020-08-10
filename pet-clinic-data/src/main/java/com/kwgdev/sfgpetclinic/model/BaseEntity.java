package com.kwgdev.sfgpetclinic.model;

import java.io.Serializable;

/**
 * created by kw on 8/2/2020 @ 8:54 PM
 */
public class BaseEntity implements Serializable {

    private Long id; // Hibernate prefers to use Box type (Long vs long) because Box types can't be null

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
