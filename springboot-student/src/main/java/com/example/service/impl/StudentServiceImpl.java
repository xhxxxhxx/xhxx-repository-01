package com.example.service.impl;

import com.example.mapper.StudentMapper;
import com.example.pojo.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> query(Student student) {
        return studentMapper.query(student);
    }

    @Override
    public void addStudent(Student student) {
        if (student.getPhone().length() != 11){
            System.out.println("请输入正确的手机号");
        }else {
            student.setDate(new Date());
            studentMapper.addStudent(student);
        }
    }

    @Override
    public Student queryById(Integer id) {
        return studentMapper.queryById(id);
    }

    @Override
    public Integer updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentMapper.deleteStudent(id);
    }

}
