package com.eci.edu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by 2099340 on 2/8/17.
 */
@RestController
public class usersController {



        @RequestMapping("app/user")
        public Principal user(Principal user) {
            return user;
        }

}
