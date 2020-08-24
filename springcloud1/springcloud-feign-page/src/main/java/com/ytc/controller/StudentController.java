package com.ytc.controller;

import com.ytc.model.Student;
import com.ytc.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @GetMapping("findAll")
    public String findAll(Model model){
        List<Student> list = studentService.findAll();
        model.addAttribute("list",list);
        System.out.println(list);
        return "index";
    }
}