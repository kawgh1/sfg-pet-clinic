package com.kwgdev.sfgpetclinic.services;

import com.kwgdev.sfgpetclinic.model.Owner;

import java.util.List;

/**
 * created by kw on 8/2/2020 @ 8:43 PM
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

//    implemented by CrudService now
//
//    Owner findById(Long id);
//
//    Owner save(Owner owner);
//
//    Set<Owner> findAll();
}
