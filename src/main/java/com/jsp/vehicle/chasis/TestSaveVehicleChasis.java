package com.jsp.vehicle.chasis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVehicleChasis {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Omkar");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Chasis chasis=new Chasis();
		chasis.setChasis_no("ch02215");
		
		Vehicle vehicle=new Vehicle();
		vehicle.setChasis(chasis);
		vehicle.setName("Swift");
		vehicle.setVehicle_type("Car");
		
		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityManager.persist(chasis);
		entityTransaction.commit();
		System.out.println("all good");
	}

}
