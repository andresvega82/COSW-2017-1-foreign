package com.eci.edu.services;

import com.eci.edu.entities.Teacher;
import com.eci.edu.entities.User;
import com.eci.edu.repository.StudentRepository;
import com.eci.edu.repository.TeacherRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.eci.edu.CoswApplication.getSessionFactory;

/**
 * Created by tata on 23/03/17.
 */
@Service
public class TeacherServicesImpl implements InterfaceTeachers{

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    private StudentRepository studentRepositorio;

    @Override
    public void updateTutor(Teacher t) {

    }

    @Override
    public List<Teacher> getTutores() {
        return teacherRepository.findAll();
    }

    @Override
    public void addTutor(Teacher t) {

    }

    @Override
    public User getTutorById(Integer id){

        String users_user_id ="";

        List<Teacher> all = teacherRepository.findAll();

        for(Teacher teacher:all){
            if(teacher.getUsers_user_id().getTeacher_id() == id){
                users_user_id = teacher.getUsers_user_id().getUsers_user_id();
                break;
            }
        }

        System.out.println("USER_ID --> "+users_user_id);




        return studentRepositorio.getUsuario(users_user_id);





    }
}
