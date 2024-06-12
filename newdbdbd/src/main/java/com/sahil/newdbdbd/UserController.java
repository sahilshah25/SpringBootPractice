package com.sahil.newdbdbd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    public final Userrepository userrepository;
    @Autowired
    public UserController(Userrepository userrepository){
        this.userrepository=userrepository;
    }
    @GetMapping("/user")
    public List<ModelUser> getUser(){
        return userrepository.findAll();
    }

}
