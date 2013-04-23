package com.zenika.zenapp.controllers;

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
//    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
//    public @ResponseBody List<User> list() {
//        return new ArrayList<User>(userRepository.values());
//    }
//    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = "application/json")
//    public @ResponseBody User getById(@PathVariable long id) {
//        return userRepository.get(id);
//    }
//
//    @RequestMapping(value = "/user", method = RequestMethod.PUT)
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void create(@RequestBody User user) {
//        long id = userIdGenerator.incrementAndGet();
//        user.setId(id);
//        userRepository.put(id, user);
//    }
//
//    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void delete(@PathVariable long id) {
//        userRepository.remove(id);
//    }
}
