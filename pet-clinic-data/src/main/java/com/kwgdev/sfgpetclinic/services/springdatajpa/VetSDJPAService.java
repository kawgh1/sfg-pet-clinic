package com.kwgdev.sfgpetclinic.services.springdatajpa;

import com.kwgdev.sfgpetclinic.model.Vet;
import com.kwgdev.sfgpetclinic.repositories.VetRepository;
import com.kwgdev.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * created by kw on 8/12/2020 @ 10:08 PM
 */
@Service
@Profile("springdatajpa")
public class VetSDJPAService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJPAService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);

    }
}
