package com.eci.edu.controllers;

import com.eci.edu.entities.Student;
import com.eci.edu.entities.User;
import com.eci.edu.services.InterfaceStudents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 2098165 on 2/16/17.
 */
@RestController
@RequestMapping(value ="/clients")
public class StudentsController {
    @Autowired
    private InterfaceStudents manejador;

    @RequestMapping(path = "/{username}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<User>> getDatosUsuario(@PathVariable String username) {
        System.out.println("Entro !!!");
        try {
            List<User> lista = new ArrayList<>();
            lista.add(manejador.getUserPorId(username));
            return ResponseEntity.ok().body(lista);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

/*
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addClient(@RequestBody Student cliente) throws Exception{
        manejador.registrarCliente(cliente);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getClient() throws Exception{
        ArrayList<Student> cli = manejador.getClientes();
        return  new ResponseEntity<>(cli, HttpStatus.ACCEPTED);
    }


    /*
     @return Obtiene un cliente en particular
     */

    /*

    @RequestMapping(value ="/{id}", method = RequestMethod.GET)
    public Student getParticularClient(@PathVariable("id") Integer id) throws Exception {
        System.out.println("entro en el java rest get usuario");
        return manejador.getClientePorId(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public ResponseEntity<?> register(@RequestBody String params) throws Exception{
        /**
        params = params.substring(1,params.length()-1);
        StrigetParticularClientng[] userParams = params.split(",");
        //User user = new User(userParams[1],userParams[2],userParams[3],userParams[4],userParams[5],userParams[6]);
        if(!manejador.registerUser(user) || !userParams[7].equals(userParams[6]))return new ResponseEntity<>(HttpStatus.CONFLICT);
         **/
    /*
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
*/
}
