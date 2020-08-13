package com.kwgdev.sfgpetclinic.services.springdatajpa;

import com.kwgdev.sfgpetclinic.model.Visit;
import com.kwgdev.sfgpetclinic.repositories.VisitRepository;
import com.kwgdev.sfgpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * created by kw on 8/12/2020 @ 10:40 PM
 */
@Service
@Profile("springdatajpa")
public class VisitSDJPAService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSDJPAService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
