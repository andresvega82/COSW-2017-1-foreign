package com.eci.edu;

import com.eci.edu.entities.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




@SpringBootApplication
public class CoswApplication {

	public static void main(String[] args) {


		SpringApplication.run(CoswApplication.class, args);





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



