package com.eci.edu.services;

import com.eci.edu.entities.CreditCard;
import com.eci.edu.entities.Student;
import com.eci.edu.entities.Teacher;
import com.eci.edu.entities.User;
import org.springframework.stereotype.Service;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.sql.Blob;

/**
 * Created by Nicolas M on 17/03/2017.
 */
@Service
public class UserServicesStub {

    public void saveUser(User user){
        user.setPhoto(null);
        SessionFactory sf=getSessionFactory();
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        s.saveOrUpdate(user);
        tx.commit();
        s.close();
        sf.close();

    }

    public void saveCreditCard(CreditCard creditCard){
        SessionFactory sf=getSessionFactory();
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        s.saveOrUpdate(creditCard);
        tx.commit();
        s.close();
        sf.close();
    }

    public void saveTeacher(Teacher teacher){
        SessionFactory sf = getSessionFactory();
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        s.saveOrUpdate(teacher);
        tx.commit();
        s.close();
        sf.close();

    }

    public void saveStudent(Student student){
        SessionFactory sf = getSessionFactory();
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        s.saveOrUpdate(student);
        tx.commit();
        s.close();
        sf.close();


    }

    public void addPhoto(Blob blob,String id){
        SessionFactory sf=getSessionFactory();
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        User o = (User) s.get(User.class, id);
        o.setPhoto(blob);
        s.saveOrUpdate(o);
        tx.commit();
        s.close();
        sf.close();
    }

    public static SessionFactory getSessionFactory() {
        // loads configuration and mappings
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(User.class);
        ServiceRegistry serviceRegistry
                = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();

        // builds a session factory from the service registry
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        return sessionFactory;
    }
}
