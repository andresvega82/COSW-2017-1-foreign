package com.eci.edu.controllers;


import com.eci.edu.entities.*;
import com.eci.edu.services.UserServicesStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nicolas M on 17/03/2017.
 */

@RestController
@RequestMapping(value = "/app")
public class RegisterController {

    @Autowired
    private UserServicesStub handler;

    @RequestMapping(value="/addUser",method = RequestMethod.POST)
    public ResponseEntity<?> addUser(@RequestBody PostObject postObject) throws Exception{
        System.out.println(postObject.toString());

        CreditCard creditCard = new CreditCard(postObject.getPaymentId(), postObject.getCardNumber(), postObject.getExpirationDate(), postObject.getPostalCode(), postObject.getCvv());
        User user = new User(postObject.getUser_id(), postObject.getName(),postObject.getLastName(),postObject.getEmail(), postObject.getPhone(), postObject.getCountry(), postObject.getAge(),creditCard.getPaymentId());
        user.setLastName(postObject.getLastName());
        handler.saveCreditCard(creditCard);
        handler.saveUser(user);
        if (postObject.getIsStudent().equals("Estudiante")){
            Student student = new Student();
            StudentId studentId = new StudentId();
            student.setStudentid(studentId);
            student.setStudentid(studentId);
            handler.saveStudent(student);
        }else if(postObject.getIsStudent().equals("Profesor")){
            Teacher teacher= new Teacher();
            TeacherId teacherId = new TeacherId();
            teacherId.setUsers_user_id(user.getUser_id());
            teacher.setUsers_user_id(teacherId);
            handler.saveTeacher(teacher);
        }else{
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
