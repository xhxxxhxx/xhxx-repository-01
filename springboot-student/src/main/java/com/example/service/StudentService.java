package com.example.service;

import com.example.pojo.Student;

import java.util.List;

public interface StudentService {

    public List<Student> query(Student student);

    public void addStudent(Student student);

    //根据id查询学生
    public Student queryById(Integer id);

    //修改
    public Integer updateStudent(Student student);

    public void deleteStudent(Integer id);
}
