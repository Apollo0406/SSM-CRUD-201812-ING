package com.service;

import com.bean.Student;
import com.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    //查询所有学生信息
    public List<Student> getAll() {
        return studentMapper.selectByExample(null);
    }
}
