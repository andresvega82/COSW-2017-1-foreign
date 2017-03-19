package com.eci.edu.services;

import com.eci.edu.entities.Student;
import com.eci.edu.entities.User;
import com.eci.edu.services.InterfazClientes;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by 2098165 on 2/16/17.
 */
public class ManejadorStudents implements InterfazClientes {
    public Hashtable<String, User> stubMemory = new Hashtable<>();
    public ArrayList<Student> clientes = new ArrayList<>();

    public void registrarCliente(Student cliente){

        clientes.add(cliente);
    }
    @Override
    public ArrayList<Student> getClientes(){

        Student fili= new Student(1,"jehova", "correo");
        clientes.add(fili);
        return clientes;
    }
    @Override
    public Student getClientePorId(Integer id){
        Student c=null;

        Student fili= new Student(2, "Juan","jehova");
        clientes.add(fili);
        for (int i=0; i<clientes.size(); i++){
            if(clientes.get(i).getUsers_user_id().equals(id)){
                c=clientes.get(i);
            }
        }
        return c;
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

