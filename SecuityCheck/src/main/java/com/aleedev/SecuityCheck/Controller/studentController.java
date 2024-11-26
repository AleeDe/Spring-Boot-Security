package com.aleedev.SecuityCheck.Controller;

import com.aleedev.SecuityCheck.Model.Student;
import com.aleedev.SecuityCheck.Service.StudentServices;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import java.util.ArrayList;
import java.util.List;

@RestController
public class studentController {

    @Autowired
    StudentServices studentServices;

    @PostMapping("/student")
    public ResponseEntity<?> createStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentServices.saveStudent(student), HttpStatus.CREATED);
    }
    @GetMapping("/token")
    public CsrfToken getCsrfToken(HttpServletRequest http){
        return (CsrfToken) http.getAttribute("_csrf");
    }
    @GetMapping("/student")
    public ResponseEntity<?> getStudent(){
        return new ResponseEntity<>(studentServices.getAllStudent(),HttpStatus.OK);
    }
}
