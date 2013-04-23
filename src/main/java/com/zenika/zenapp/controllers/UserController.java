package com.zenika.zenapp.controllers;

import com.zenika.zenapp.dao.UserDao;
import com.zenika.zenapp.dao.UserDaoImpl;
import com.zenika.zenapp.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Julien Bourgain
 */
@Controller
public class UserController {
    UserDao userDao = new UserDaoImpl();

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody List<User> list() {
        return new ArrayList<User>(userDao.getAll());
    }
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody User getById(@PathVariable long id) {
        return userDao.getById(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void create(@RequestBody User user) {
        userDao.upsert(user);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        userDao.delete(id);
    }
}
