package com.kwegdev.sfgpetclinic.services.map;

import com.kwegdev.sfgpetclinic.model.Pet;
import com.kwegdev.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * created by kw on 8/2/2020 @ 11:32 PM
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
}
