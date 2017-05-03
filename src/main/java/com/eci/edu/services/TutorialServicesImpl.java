package com.eci.edu.services;

import com.eci.edu.entities.Teacher;
import com.eci.edu.entities.Tutorial;
import com.eci.edu.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eci.edu.entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import java.util.List;

/**
 * Created by tata on 23/03/17.
 */

@Service
public class TutorialServicesImpl implements InterfaceTutorials{

    @Autowired
    TutorialRepository tutorialRepository;

    @Override
    public void updateTutorial(Tutorial t) {

    }

    @Override
    public List<Tutorial> getTutorials() {
        return tutorialRepository.findAll();
    }

    @Override
    public void addTutorial(Tutorial t) {
        //tutorialRepository.save(t);
    }

    @Override
    public List<Tutorial> getTutorialByUserId(Integer id) {
        return null;//tutorialRepository.findTutorialByUserId();
    }

    @Override
    public List<Tutorial> getHistory(String id) {
        return tutorialRepository.getHistoryById(id);
    }

    @Override
    public List<Teacher> getTutorialsByParams(String params){

        SessionFactory sf = getSessionFactory();
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();



        tx.commit();
        s.close();
        sf.close();

        return null;//tutorialRepository.getTutorialByParams(params);
    }


    public static SessionFactory getSessionFactory() {
        // loads configuration and mappings
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(CreditCard.class);
        configuration.addAnnotatedClass(Languaje.class);
        configuration.addAnnotatedClass(Student.class);
        configuration.addAnnotatedClass(StudentId.class);

        configuration.addAnnotatedClass(TeacherId.class);
        configuration.addAnnotatedClass(Teacher.class);
        configuration.addAnnotatedClass(Tutorial.class);

        ServiceRegistry serviceRegistry
                = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();

        // builds a session factory from the service registry
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        return sessionFactory;
    }
}
