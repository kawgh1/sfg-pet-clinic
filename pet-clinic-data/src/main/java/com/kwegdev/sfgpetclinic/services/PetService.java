package com.kwegdev.sfgpetclinic.services;

import com.kwegdev.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * created by kw on 8/2/2020 @ 8:45 PM
 */
public interface PetService {

   Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
