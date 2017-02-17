package com.eci.edu.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.util.Set;

/**
 * Created en 17/02/17.
 */

@RestController
@RequestMapping(value = "/tutorial")

    private ClientServicesStub stub = new ClientServicesStub();

    @RequestMapping(method = RequestMethod.GET)
    public Set<Client> getClients(){
        return stub.getAllClients();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Client getUser(@PathVariable("id") Integer id) throws Throwable{
        return stub.getClientById(id);
    }

    @RequestMapping(value = "/{id}/picture", method = RequestMethod.GET)
    public ResponseEntity<?> getUserPicture(@PathVariable("id") Integer id){
        ResponseEntity<?> ans;
        try{
            ans=ResponseEntity.ok().contentType(MediaType.parseMediaType("image/jpg")).body(new InputStreamResource(stub.getClientPicture(id)));
        }catch (Throwable e){
            ans= new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ans;
    }
}