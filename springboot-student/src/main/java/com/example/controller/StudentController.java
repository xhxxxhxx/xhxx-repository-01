package com.example.controller;

import com.example.ddd.DemoStudent;
import com.example.pojo.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("/query")
    public List<Student> query(){
        return studentService.query(null);
    }

    //插入用户信息
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public Boolean insert(Student student){
        return studentService.save(student);
    }

    //更改
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public Boolean update(Student student){
        return studentService.update(student);
    }

    //通过id查询
    @RequestMapping(value = "/queryById/{id}", method = RequestMethod.GET)
    public String queryById(@PathVariable int id){
        return studentService.queryById(id).toString();
    }

    //通过id删除
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public Boolean delete(int id){
        return studentService.delete(id);
    }

    //根据名字模糊查询
    @RequestMapping(value = "/queryByName/{name}", method = RequestMethod.GET)
    public List<Student> queryByName(@PathVariable String name){
        return studentService.queryByName(name);
    }

    //根据时间查询
    @RequestMapping(value = "/queryByDate/{date1},{date2}", method = RequestMethod.GET)
    public List<Student> queryByDate(@PathVariable String date1,@PathVariable String date2){
        return studentService.queryByDate(date1,date2);
    }

    @RequestMapping("/queryByND/{name},{date1},{date2}")
    public List<Student> queryByND(@PathVariable String name,@PathVariable String date1,@PathVariable String date2){
        return studentService.queryByND(name, date1, date2);
    }

    @RequestMapping("/queryByND2")
    public List<Student> queryByND2(@RequestBody DemoStudent demoStudent){
        String name = demoStudent.getName();
        String date1 = demoStudent.getDate1();
        String date2 = demoStudent.getDate2();
        return studentService.queryByND2(name,date1,date2);
    }
}
