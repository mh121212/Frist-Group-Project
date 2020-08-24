package com.ytc.mapper;

import com.ytc.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("select * from students")
    List<Student> findAll();
}
