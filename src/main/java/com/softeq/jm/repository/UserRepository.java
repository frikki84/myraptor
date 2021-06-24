package com.softeq.jm.repository;

import com.softeq.jm.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by ydziadkouskaya on 6/24/2021.
 */
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    /*
    save
    get by name and password
    find by id
     */

    public void save(User user) {
        entityManager.persist(user);
    }

    public User getUser(String email, String password) {
        User user = entityManager.createNamedQuery("select u from User where u.email = :email and u.password = :password", User.class)
            .setParameter("email", email)
            .setParameter("password", password)
            .getSingleResult();

        return user;
    }

    public User getById(Integer id) {
        return entityManager.find(User.class, id);
    }
}
