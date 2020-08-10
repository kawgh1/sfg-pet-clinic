package com.kwgdev.sfgpetclinic.services.map;

import com.kwgdev.sfgpetclinic.model.Owner;
import com.kwgdev.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * created by kw on 8/2/2020 @ 11:27 PM
 */
// public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

@Service                            // OwnerService implements CrudService, generics no longer needed.
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }


    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
