package com.ytc.service;

import com.ytc.model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(value = "springcloud-provider")
public interface StudentService {

    @GetMapping("findAll")
    List<Student> findAll();
}
