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

		//		TypedQuery<Personajes> query = entityManager.createQuery("SELECT p FROM personaje p", Personajes.class);
		//		List<Personajes> results = query.getResultList();
		//		
		//		for (Personajes p : results) {
		//			System.out.println("Nombre: " + p.getNombre_personaje());
		//			System.out.println("Ataque" + p.getAtaque());
		//			System.out.println("Defensa" + p.getDefensa());
		//			System.out.println("Faccion_id" + p.getFaccion_id());
		//		}

		String sql = "SELECT p from personaje p where p.personaje_id >= 0";
		Query query = entityManager.createQuery(sql);		 
		List <Personaje> results = query.getResultList();
		
		for (Personaje p : results) {
			p.toString();
		}
		entityManager.getTransaction().commit();

		entityManager.close();
		factory.close();
	}

}
