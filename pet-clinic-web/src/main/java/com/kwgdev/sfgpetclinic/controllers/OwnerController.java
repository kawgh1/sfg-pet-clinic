package com.kwgdev.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by kw on 8/3/2020 @ 12:09 AM
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"/", "", "/index", "/index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
