package com.kwegdev.sfgpetclinic.services;

import com.kwegdev.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * created by kw on 8/2/2020 @ 8:46 PM
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
