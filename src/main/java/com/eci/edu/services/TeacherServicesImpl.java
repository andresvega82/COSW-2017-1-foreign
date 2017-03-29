package com.eci.edu.services;

import com.eci.edu.entities.Teacher;
import com.eci.edu.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tata on 23/03/17.
 */
@Service
public class TeacherServicesImpl implements InterfaceTeachers{

    @Autowired
    TeacherRepository teacherRepository;

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
}
