package com.aleedev.SecuityCheck.Service;

import com.aleedev.SecuityCheck.Model.Student;
import com.aleedev.SecuityCheck.Model.Users;
import com.aleedev.SecuityCheck.Repsoritory.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentServices {
    @Autowired
    StudentRepository studentRepository;

    public ArrayList<Student> getAllStudent(){
        return (ArrayList<Student>) studentRepository.findAll();
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

}
