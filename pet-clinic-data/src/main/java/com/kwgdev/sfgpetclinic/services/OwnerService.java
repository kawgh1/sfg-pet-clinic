package com.kwgdev.sfgpetclinic.services;

import com.kwgdev.sfgpetclinic.model.Owner;

/**
 * created by kw on 8/2/2020 @ 8:43 PM
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

//    implemented by CrudService now
//
//    Owner findById(Long id);
//
//    Owner save(Owner owner);
//
//    Set<Owner> findAll();
}
