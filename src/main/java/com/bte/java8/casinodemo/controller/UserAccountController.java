package com.bte.java8.casinodemo.controller;

import com.bte.java8.casinodemo.entity.UserAccount;
import com.bte.java8.casinodemo.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserAccountController {

        @Autowired
    private UserAccountRepository repository;

    @RequestMapping(method = RequestMethod.POST, value = "/add-user")
    public void addUserAccount( UserAccount userAccount){
        System.out.println("User was successfully created: " + userAccount);
        repository.save(userAccount);
    }


}
