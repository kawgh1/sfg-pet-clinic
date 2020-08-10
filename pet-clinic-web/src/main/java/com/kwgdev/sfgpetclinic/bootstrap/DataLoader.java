package com.kwgdev.sfgpetclinic.bootstrap;

import com.kwgdev.sfgpetclinic.model.Owner;
import com.kwgdev.sfgpetclinic.model.Vet;
import com.kwgdev.sfgpetclinic.services.OwnerService;
import com.kwgdev.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * created by kw on 8/10/2020 @ 9:51 AM
 */
@Component
public class DataLoader implements CommandLineRunner {



    private final OwnerService ownerService;
    private final VetService vetService;

    // Constructor
    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    // created using alt-insert -> implement methods.
    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        // owner1.setId(1L); Setting ID now automated on save() in AbstractMapService
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        // owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

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
