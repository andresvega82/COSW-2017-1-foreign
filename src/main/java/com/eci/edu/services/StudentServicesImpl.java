package com.eci.edu.services;

import com.eci.edu.entities.*;
import com.eci.edu.repository.StudentRepository;
import com.eci.edu.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tata on 23/03/17.
 */
@Service
public class StudentServicesImpl implements InterfaceStudents{

    @Autowired
    private StudentRepository repositorio;

    
    @Autowired
    private TutorialRepository tutorialRepository;

    @Override
    public void registrarCliente(Student student) {

    }

    @Override
    public ArrayList<Student> getClientes() {
        return null;
    }

    @Override
    public Student getClientePorId(Integer id) {
        return null;
    }

    @Override
    public User  getUserPorId (String nombre) {;
        try {
            User u = repositorio.getUsuario(nombre);
            System.out.println(u.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        //System.out.println("Lo que me trae la consulta "+repositorio.getUsuario(nombre).toString());
        return (User) repositorio.getUsuario(nombre);
    }

    @Override
    public boolean registerUser(User user) {
        return false;
    }


}
