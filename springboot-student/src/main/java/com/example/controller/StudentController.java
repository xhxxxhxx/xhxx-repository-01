package com.example.controller;

import com.example.pojo.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    //基础页面的请求
    @RequestMapping("/add")
    public String add(){
        return "addStudent";
    }

    @RequestMapping("/student/query")
    public String query(Model model){
        model.addAttribute("list",studentService.query(null));
        return "student";
    }

    @RequestMapping("/addStudent")
    public String addStudent(Student student){
        studentService.addStudent(student);
        return "redirect:/student/query";
    }

    @RequestMapping("/student/updateInfo")
    public String updateInfo(Integer id,Model model){
        Student student = studentService.queryById(id);
        model.addAttribute("student",student);
        return "updateStudent";
    }

    @RequestMapping("/student/update")
    public String updateStudent(Student student){
        studentService.updateStudent(student);
        return "redirect:/student/query";
    }

    @RequestMapping("/student/deleteStudent")
    public String deleteStudent(Integer id){
        studentService.deleteStudent(id);
        return "redirect:/student/query";
    }

}
