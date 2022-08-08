package org.example;

import org.example.models.CapitalCity;
import org.example.models.Country;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaCreate {

    public static void main(String[] args) {
        Country country = new Country();
        country.setName("USA");

        CapitalCity cap = new CapitalCity();
        cap.setName("Washington DC");

        cap.setCountry(country);

        // create EntityManager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // access transaction object
        EntityTransaction transaction = entityManager.getTransaction();

        // create and use transactions
        transaction.begin();
        entityManager.persist(country);
        entityManager.persist(cap);
        transaction.commit();

        // close entity manager
        entityManager.close();
        entityManagerFactory.close();


    }


}
