package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Personaje;


public class Prinicipal {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ForHonorDB");
		EntityManager entityManager = factory.createEntityManager();

		entityManager.getTransaction().begin();

		Query query = entityManager.createQuery("select p from Personaje p");
		List<Personaje> results = (List<Personaje>) query.getResultList();

		for (Personaje p : results) {
			System.out.println("========================================");
			System.out.println("Personaje_id:" + p.getPersonaje_id());
			System.out.println("Nombre: " + p.getNombre_personaje());
			System.out.println("Ataque" + p.getAtaque());
			System.out.println("Defensa" + p.getDefensa());
			System.out.println("Faccion_id" + p.getFaccion_id());			
			System.out.println("========================================");
		}

		entityManager.getTransaction().commit();

		entityManager.close();
		factory.close();
	}

}
