package com.zenika.zenapp.dao;

import com.zenika.zenapp.models.User;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: zenika
 * Date: 23/04/13
 * Time: 10:38
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao {
    ArrayList<User> getAll();
    User getById(long id);
    void upsert(User user);
    void delete(long id);
}
