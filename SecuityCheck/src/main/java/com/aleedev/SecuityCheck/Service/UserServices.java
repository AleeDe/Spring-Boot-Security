package com.aleedev.SecuityCheck.Service;

import com.aleedev.SecuityCheck.Model.Users;
import com.aleedev.SecuityCheck.Repsoritory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserServices {
    @Autowired
    UserRepository userRepository;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public Users saveUser(Users users){
        users.setPassword(encoder.encode(users.getPassword()));
        return userRepository.save(users);
    }
    public ArrayList<Users> getAllUser(){
        return (ArrayList<Users>) userRepository.findAll();
    }

}
