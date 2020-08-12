package com.kwgdev.sfgpetclinic.bootstrap;

import com.kwgdev.sfgpetclinic.model.Owner;
import com.kwgdev.sfgpetclinic.model.Pet;
import com.kwgdev.sfgpetclinic.model.PetType;
import com.kwgdev.sfgpetclinic.model.Vet;
import com.kwgdev.sfgpetclinic.services.OwnerService;
import com.kwgdev.sfgpetclinic.services.PetTypeService;
import com.kwgdev.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * created by kw on 8/10/2020 @ 9:51 AM
 */
@Component
public class DataLoader implements CommandLineRunner {



    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    // Constructor
    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }


    // created using alt-insert -> implement methods.
    @Override
    public void run(String... args) throws Exception {

        // what kind of pets does our clinic take? Dogs and Cats ONLY for now.
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        // owner1.setId(1L); Setting ID now automated on save() in AbstractMapService
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerell");
        owner1.setCity("Miami");
        owner1.setTelephone("6547893544");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");

        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        // owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("7878 Sunset Blvd");
        owner2.setCity("Miami");
        owner2.setTelephone("7865354235");

        Pet fionasPet = new Pet();
        fionasPet.setPetType(savedCatPetType);
        fionasPet.setOwner(owner2);
        fionasPet.setBirthDate(LocalDate.now());
        fionasPet.setName("Just Cat");

        owner2.getPets().add(fionasPet);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        // vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        // vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");

    }
}
