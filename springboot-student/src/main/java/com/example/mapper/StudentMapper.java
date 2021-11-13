package com.example.mapper;

import com.example.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
public interface StudentMapper {

    //查询全部
    public List<Student> query(Student student);

    //增加
    Boolean save(Student student);

    //修改
    Boolean update(Student student);

    //通过id查询
    Student queryById(int id);

    //通过id删除
    Boolean delete(int id);

    //通过名字模糊查询
    List<Student> queryByName(String name);

    //根据时间范围查询
    List<Student> queryByDate(String date1, String date2);

    //根据名字和时间范围查询
    List<Student> queryByND(String name,String date1, String date2);

    List<Student> queryByND2(String name,String date1, String date2);
}
