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

import java.nio.charset.Charset;

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
        //user.setPhoto( new javax.sql.rowset.serial.SerialBlob(postObject.getPhoto().getBytes(Charset.forName("UTF-8"))));
        handler.saveCreditCard(creditCard);
        handler.saveUser(user);
        if (postObject.getIsStudent().equals("Estudiante")){
            Student student = new Student();
            StudentId studentId = new StudentId();
            studentId.setUser_id(user.getUser_id());
            studentId.setStudent_id(keyHash(user.getName()));
            student.setStudentid(studentId);
            student.setDescription(user.getName()+" "+user.getLastName());
            handler.saveStudent(student);
        }else if(postObject.getIsStudent().equals("Profesor")){
            Teacher teacher= new Teacher();
            TeacherId teacherId = new TeacherId();
            teacherId.setUsers_user_id(user.getUser_id());
            teacherId.setTeacher_id(keyHash(user.getName()));
            teacher.setUsers_user_id(teacherId);
            teacher.setDescription(user.getName()+" "+user.getLastName());
            handler.saveTeacher(teacher);
        }else{
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    int keyHash(String key)
    {
        int k = (int)key.length();
        int u = 0,n = 0;

        for (int i=0; i<k; i++)
        {
            n = (int)key.charAt(i);
            u += i*n%31;
        }
        return u%139;
    }
}
