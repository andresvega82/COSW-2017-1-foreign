package com.eci.edu.services;

import com.eci.edu.entities.Student;
import com.eci.edu.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import static com.eci.edu.CoswApplication.getSessionFactory;

/**
 * Created by nicolasguzmanp on 19/03/17.
 */
@Service
public class StudentsServiceImpl implements InterfazClientes {

    @Override
    public void registrarCliente(Student cliente) {
        SessionFactory sf=getSessionFactory();
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        s.saveOrUpdate(cliente);
        tx.commit();
        s.close();
        sf.close();
    }

    @Override
    public ArrayList<Student> getClientes() {
        return null;
    }

    @Override
    public Student getClientePorId(Integer id) {
        SessionFactory sf=getSessionFactory();
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        //falta
        sf.close();
        s.close();
        return null;
    }

    @Override
    public boolean registerUser(User user) {
        return false;
    }
}
