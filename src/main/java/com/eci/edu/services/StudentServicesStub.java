package com.eci.edu.services;

import com.eci.edu.entities.Student;
import com.eci.edu.entities.Tutorial;
import com.eci.edu.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by 2098165 on 2/16/17.
 */
//@Service
public class StudentServicesStub implements InterfaceStudents {
    public Hashtable<String, User> stubMemory = new Hashtable<>();
    public ArrayList<Student> clientes = new ArrayList<>();

    public void registrarCliente(Student student){

        clientes.add(student);
    }
    @Override
    public ArrayList<Student> getClientes(){
        return clientes;
    }
    @Override
    public Student getClientePorId(Integer id){
        Student c=null;

        Student fili= null;//new Student(2, "Juan","jehova", "correo", 654, "juana", "brasil", "bogota","español" );
        clientes.add(fili);
        return c;
    }

    @Override
    public User getUserPorId(String nombre) {
        return null;
    }

    @Override
    /**
     * Registrar un usuario al sistema.
     */
    public boolean registerUser(User user) {

        if(stubMemory.contains(user.getEmail()))return false;
        stubMemory.put(user.getEmail(),user);
        return true;
    }


}

