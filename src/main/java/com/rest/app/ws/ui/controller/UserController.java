package com.rest.app.ws.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping(path="/{userId}")
    public String getUser(@PathVariable String userId){
        return "get users was called userId = " + userId;
    }

    @GetMapping
    public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
                           @RequestParam(value = "limit", defaultValue = "15") int limit,
                           @RequestParam(value = "sort", defaultValue = "desc", required = false) String sort){
        return "get users was called with page = " + page + " and limit " + limit + " and sort " + sort;
    }

    @PostMapping
    public String createUser(){
        return "create user was called";
    }

    @PutMapping
    public String updateUser(){
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete user was called";
    }
}
