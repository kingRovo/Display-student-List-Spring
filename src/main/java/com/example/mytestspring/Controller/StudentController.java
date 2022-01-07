package com.example.mytestspring.Controller;
import com.example.mytestspring.Model.Student;
import com.example.mytestspring.repositriy.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("/add")
    public void addStd(@RequestBody Student student){

        studentRepo.save(student);
    }

    @GetMapping("/all")
    public List<Student> displayAll(){

        return  studentRepo.findAll();
    }

}
