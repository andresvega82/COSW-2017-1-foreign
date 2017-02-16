package com.eci.edu.controllers;

import com.eci.edu.entities.Client;
import com.eci.edu.services.ManejadorClientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Set;

/**
 * Created by 2098165 on 2/16/17.
 */
@RestController
@RequestMapping(value ="/clients")
public class RestClients {


    @Autowired
    ManejadorClientes manejador;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addClient(@RequestBody Client cliente) throws Exception{
        manejador.registrarCliente(cliente);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getClient() throws Exception{
        ArrayList<Client> cli = manejador.getClientes();
        return  new ResponseEntity<>(cli, HttpStatus.ACCEPTED);
    }


    /*
     @return Obtiene un cliente en particular
     */
    @RequestMapping(value ="/{id}", method = RequestMethod.GET)
    public Client getParticularClient(@PathVariable("id") String id) throws Exception {
        return manejador.getClientePorId(id);
    }

}
