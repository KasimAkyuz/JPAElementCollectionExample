package com.akyuz.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.akyuz.pojo.Address;
import com.akyuz.pojo.User;

public class UserTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();

		Address address1 = new Address("Menekşe", "Fatih", "İstanbul");
		Address address2 = new Address("karanfil", "Fatih", "İstanbul");
		List<Address> addresses = new ArrayList<>();
		addresses.add(address1);
		addresses.add(address2);

		User user = new User("Kasım", new Date(), addresses);
		
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();

	}

}
