package com.example.service.impl;

import com.example.mapper.StudentMapper;
import com.example.pojo.Student;
import com.example.service.StudentService;
import org.apache.ibatis.annotations.Param;
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
    public Boolean save(Student student) {
        //判断手机号位数
        if (student.getPhone().length() != 11){
            return false;
        }else {
            //添加的时间
            student.setDate(new Date());
            return studentMapper.save(student);
        }
    }

    @Override
    public Boolean update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public Student queryById(int id) {
        return studentMapper.queryById(id);
    }

    @Override
    public Boolean delete(int id) {
        return studentMapper.delete(id);
    }

    @Override
    public List<Student> queryByName(@Param("name") String name) {
        return studentMapper.queryByName(name);
    }

    @Override
    public List<Student> queryByDate(String date1,String date2) {
        return studentMapper.queryByDate(date1,date2);
    }

    @Override
    public List<Student> queryByND(String name, String date1, String date2) {
        return studentMapper.queryByND(name,date1,date2);
    }

    @Override
    public List<Student> queryByND2(String name, String date1, String date2) {
        return studentMapper.queryByND2(name,date1,date2);
    }
}
