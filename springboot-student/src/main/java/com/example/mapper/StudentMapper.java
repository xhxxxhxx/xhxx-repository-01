package com.example.mapper;

import com.example.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface StudentMapper {

    //查询全部
    public List<Student> query(Student student);

    //增加
    public void addStudent(Student student);

    //根据id查询学生
    public Student queryById(Integer id);

    //修改
    public Integer updateStudent(Student student);

    //删除
    public void deleteStudent(Integer id);


}
