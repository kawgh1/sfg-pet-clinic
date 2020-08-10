package com.kwgdev.sfgpetclinic.services.map;

import com.kwgdev.sfgpetclinic.model.BaseEntity;

import java.util.*;

/**
 * created by kw on 8/2/2020 @ 11:22 PM
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) { // when we save an object
        if(object != null) {
           if(object.getId() == null) { // if the new object (Person) is NOT null and the ID IS null, then get the next Id
               object.setId(getNextId());
           }
            map.put(object.getId(), object);
        }

        else {
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));


    }

    private Long getNextId(){
        Long nextId = null;
        try{
            nextId = Collections.max(map.keySet()) + 1; // if object is null -> exception, then assign ID = '1L'
        } catch (NoSuchElementException exc) {
            nextId = 1L;
        }
        return nextId;
    }
}
