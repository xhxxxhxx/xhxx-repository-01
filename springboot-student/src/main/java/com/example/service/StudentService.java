package com.example.service;

import com.example.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface StudentService {

    public List<Student> query(Student student);

    //增加
    Boolean save(Student student);

    //修改
    Boolean update(Student student);

    //根据ID查询
    public Student queryById(int id);

    //删除
    Boolean delete(int id);

    //根据名字模糊查询
    List<Student> queryByName(@Param("name") String name);

    //根据时间查询
    List<Student> queryByDate(String date1, String date2);

    List<Student> queryByND(String name,String date1, String date2);

    List<Student> queryByND2(String name,String date1, String date2);
}
