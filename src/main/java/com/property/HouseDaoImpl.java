package com.property;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by D on 1/24/2016.
 */
public class HouseDaoImpl implements HouseDao {

    private static EntityManager entityManager;

    @Override
    public void create(House house) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UserPersistenceUnit");
        entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(house);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(House house) {

    }

    @Override
    public List<House> find(int houseId) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UserPersistenceUnit");
        entityManager = emf.createEntityManager();

        return entityManager.createQuery(
                "SELECT h FROM House h WHERE h.id LIKE :id")
                .setParameter("id", houseId)
                .getResultList();
    }

    @Override
    public void delete(House house) {

    }
}
