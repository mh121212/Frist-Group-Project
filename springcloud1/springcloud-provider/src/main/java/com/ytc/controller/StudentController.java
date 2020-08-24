package com.ytc.controller;

import com.ytc.model.Student;
import com.ytc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("findAll")
    public List<Student> findAll(){
        List<Student> list = studentService.findAll();
        System.out.println(list);
        return list;
    }
}