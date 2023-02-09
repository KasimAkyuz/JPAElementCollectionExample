package com.akyuz.test;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.akyuz.pojo.Personel;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();

		

		Personel personel = new Personel("YİĞİT", "AKYUZ", new Date(), null);
		List<String> phonList = new ArrayList<>();
		phonList.add("5324444");
		phonList.add("5325656");
		personel.setPhoneNumber(phonList);
		
		
		manager.getTransaction().begin();
		manager.persist(personel);
		manager.getTransaction().commit();

	}

}
