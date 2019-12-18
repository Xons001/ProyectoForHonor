package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Personajes;

public class Prinicipal {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ForHonorDB");
		EntityManager entityManager = factory.createEntityManager();
		 
		entityManager.getTransaction().begin();
		
		String sql = "SELECT * from personaje";
		Query query = entityManager.createQuery(sql);
		Personajes pers= (Personajes) query.getResultList();
		 
		System.out.println(pers);
		entityManager.getTransaction().commit();
        
        entityManager.close();
        factory.close();
	}

}
