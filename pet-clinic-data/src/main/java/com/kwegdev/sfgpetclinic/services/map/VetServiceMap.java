package com.kwegdev.sfgpetclinic.services.map;

import com.kwegdev.sfgpetclinic.model.Vet;
import com.kwegdev.sfgpetclinic.services.VetService;

import java.util.Set;

/**
 * created by kw on 8/2/2020 @ 11:33 PM
 */
// public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

                        // VetService implements CrudService, generics no longer needed
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {


    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
