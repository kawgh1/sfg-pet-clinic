package com.kwgdev.sfgpetclinic.services.map;

import com.kwgdev.sfgpetclinic.model.Owner;
import com.kwgdev.sfgpetclinic.model.Pet;
import com.kwgdev.sfgpetclinic.services.OwnerService;
import com.kwgdev.sfgpetclinic.services.PetService;
import com.kwgdev.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * created by kw on 8/2/2020 @ 11:27 PM
 */
// public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

@Service                            // OwnerService implements CrudService, generics no longer needed.
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

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

        if(object != null) {
            if (object.getPets() != null) {  // if owner has pets
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null) {  // and if each of those pets HAS a PetType
                        if (pet.getPetType().getId() == null) {  // but dont have a PetType Id
                            // then save them to the owner thru petTypeService so we can get a PetType Id assigned correctly
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet Type is required!");
                    }
                    if(pet.getId() == null) {
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        }else {
            return null;
        }
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
