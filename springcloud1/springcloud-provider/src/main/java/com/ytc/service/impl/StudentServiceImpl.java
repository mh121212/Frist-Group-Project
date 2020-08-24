package com.ytc.service.impl;

import com.ytc.mapper.StudentMapper;
import com.ytc.model.Student;
import com.ytc.service.StudentService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }
}
