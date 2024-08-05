package com.example.rest_demo.controller;

import com.example.rest_demo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserAPI {

    User user;
    //get request
    @GetMapping("{userId}")
    public User getUserDetails(String userId)
    {
        return user;
                //new User("C001", "Nur Hanifah", "Shah Alam", "0196154142");
    }

    @PostMapping
    //post request
    public String createUser(@RequestBody User user)
    {
        this.user = user;

        return "User Successfully Created";
    }

    @PutMapping
    //update request
    public String updateUser(@RequestBody User user)
    {
        this.user = user;

        return "User Successfully Updated";
    }

    @DeleteMapping("{userId}")
    //delete request
    public String deleteUser(String userId)
    {
        this.user = null;

        return "User Successfully Deleted";
    }
}
