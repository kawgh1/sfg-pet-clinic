package com.kwgdev.sfgpetclinic.repositories;

import com.kwgdev.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * created by kw on 8/12/2020 @ 9:51 PM
 */
// Crud repo takes in an object and its ID, here an Owner and its ID(Long)
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
