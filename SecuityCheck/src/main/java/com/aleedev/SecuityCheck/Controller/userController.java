package com.aleedev.SecuityCheck.Controller;

import com.aleedev.SecuityCheck.Model.Users;
import com.aleedev.SecuityCheck.Service.UserServices;
import org.apache.tomcat.util.buf.UEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
    @Autowired
    UserServices userServices;

    @PostMapping("/user")
    public ResponseEntity<?> saveUser(@RequestBody Users users){
        return new ResponseEntity<>(userServices.saveUser(users), HttpStatus.CREATED);
    }
    @GetMapping("/user")
    public ResponseEntity<?> getAlluser(){
        return new ResponseEntity<>(userServices.getAllUser(),HttpStatus.OK);
    }

}
