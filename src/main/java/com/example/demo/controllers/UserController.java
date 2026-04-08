package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("users")
class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public List<User> hello(){
        return List.of(new User("dlkfjsl", "ijdfadj@djfldj.com", 34));
    }



    @GetMapping("/hello")
    public String testController(){
        return "Hello from user controller";
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable String id) throws Exception{
        return userService.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) throws Exception{
        return userService.createUser(user);
    }

}
