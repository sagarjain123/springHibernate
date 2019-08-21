package com.sai.om.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sai.om.dto.CarDTO;

public class CarDAO {
	
	public CarDAO() {
		System.out.println("cardao is created");
	}

	public void SaveCar(CarDTO CarDTO)
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CarDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(CarDTO);
		transaction.commit();
		session.close();
		factory.close();
	}
	public void deleteCar(CarDTO CarDTO)
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CarDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.delete(CarDTO);
		transaction.commit();
		session.close();
		factory.close();
	}
	public void updateCar(CarDTO CarDTO)
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CarDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(CarDTO);
		transaction.commit();
		session.close();
		factory.close();
	}
	public CarDTO getCar(CarDTO CarDTO)
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CarDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		CarDTO dto=session.get(CarDTO.getClass(),1);
		transaction.commit();
		session.close();
		factory.close();
		return dto;
	}

}
