package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.domain.Login;
import com.repository.LoginRepo;
import org.springframework.stereotype.Service;


@Service
public class LoginService {


   @Autowired
   private LoginRepo rep;


   public Login log(String username, String password) {
       Login user = rep.findByUsernameAndPassword(username, password);
       return user;
   }
}

