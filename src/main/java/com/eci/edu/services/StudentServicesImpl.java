package com.eci.edu.services;

import com.eci.edu.entities.*;
import com.eci.edu.repository.StudentRepository;
import com.eci.edu.repository.TutorialByStudentRepository;
import com.eci.edu.repository.TutorialRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.eci.edu.services.UserServicesStub.getSessionFactory;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 * Created by tata on 23/03/17.
 */
@Service
public class StudentServicesImpl implements InterfaceStudents{

    @Autowired
    private StudentRepository repositorio;

    @Autowired
    private TutorialByStudentRepository tutorialByStudentRepository;

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

    @Override
    public List<Tutorial> getTutoriasByStudent(String user) {

        List<Student> all = repositorio.findAll();
        Integer id = 1;

        for(Student student:all){
            if(student.getStudentid().getUser_id().equals(user)){
                id = student.getStudentid().getStudent_id();
                break;
            }
        }

        List<TutorialByStudent> tutorialsByStudent = tutorialByStudentRepository.getTutorialsByStudent(id);

        List<Tutorial> tutorials = new ArrayList<Tutorial>();

        List<Tutorial> all1 = tutorialRepository.findAll();

        for(TutorialByStudent tutorialsByStudent1:tutorialsByStudent){
            for(Tutorial tutorial:all1){
                if(tutorialsByStudent1.getTutorialByStudentId().getTutoriasl_tutorial_id() == tutorial.getIdTutor().getId()){
                    tutorials.add(tutorial);
                }
            }
        }


        return tutorials;
    }
}
