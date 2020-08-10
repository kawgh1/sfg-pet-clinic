package com.kwgdev.sfgpetclinic.services;

import java.util.Set;

/**
 * created by kw on 8/2/2020 @ 11:12 PM
 */
public interface CrudService <T, ID> {

    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
}
