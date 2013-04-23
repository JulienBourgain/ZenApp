package com.zenika.zenapp.dao;

import com.zenika.zenapp.models.User;

import java.util.ArrayList;

/**
 * @author Julien Bourgain
 */
public class UserDaoImpl implements UserDao {

    public ArrayList<User> getAll(){
        ArrayList<User> userList = new ArrayList<User>();
        return userList;
    }

    public User getById(long id){
        User user = new User();
        return user;
    }

    public void upsert(User user){

    }

    public void delete(long id){

    }
}
