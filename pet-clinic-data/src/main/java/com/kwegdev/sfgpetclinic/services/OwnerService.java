package com.kwegdev.sfgpetclinic.services;

import com.kwegdev.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * created by kw on 8/2/2020 @ 8:43 PM
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
