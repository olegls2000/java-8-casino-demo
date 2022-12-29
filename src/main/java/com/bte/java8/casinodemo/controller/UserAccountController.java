package com.bte.java8.casinodemo.controller;

import com.bte.java8.casinodemo.entity.UserAccount;
import com.bte.java8.casinodemo.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserAccountController {

    @Autowired
    private UserAccountRepository repository;

    @PostMapping("/add-user")
    public void addUserAccount(UserAccount userAccount) {
        System.out.println("User was successfully created: " + userAccount);
        repository.save(userAccount);

    }


}
