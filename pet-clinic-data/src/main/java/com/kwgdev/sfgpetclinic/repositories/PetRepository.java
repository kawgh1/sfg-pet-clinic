package com.kwgdev.sfgpetclinic.repositories;

import com.kwgdev.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * created by kw on 8/12/2020 @ 9:52 PM
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
