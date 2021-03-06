package com.eci.edu;

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

import java.util.Date;


@SpringBootApplication
@EnableJpaRepositories("com.eci.edu.repository")
@EntityScan("com.eci.edu.entities")
public class CoswApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoswApplication.class, args);

		SessionFactory sf=getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();

/*
		s.saveOrUpdate(new CreditCard(10,13131,new Date(),9090,10));
		s.saveOrUpdate(new User("gasds67","vega","vega","hotmail","34343","CTO",23,10));
		s.saveOrUpdate(new Student(new StudentId(1,"gasds67"),"torres"));

		s.saveOrUpdate(new User("Sebas_Porras","name","lastname","correo","1234456","Pais",23,10));
		s.saveOrUpdate(new Teacher(new TeacherId(1, "Sebas_Porras"), "sebis", null));
		s.saveOrUpdate(new Languaje(1,"Español"));
		s.saveOrUpdate(new Tutorial("cancelada", new Date(),50, new TutorialId(1, 1,1), 2000, 2000));


*/

		tx.commit();
		s.close();
		sf.close();


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