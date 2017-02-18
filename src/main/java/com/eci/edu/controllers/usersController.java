package com.eci.edu.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.security.Principal;

/**
 * Created by ASUS on 17/02/2017.
 */


@RestController
public class usersController {


    @RequestMapping("/app/user")
    public Principal user (Principal user){
        return user;
    }
}
