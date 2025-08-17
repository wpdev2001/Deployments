package com.wp.controllers;

import com.wp.entities.Student;
import com.wp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/list")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @RequestMapping("/addStudent")
    public Student addStudent(){
        Student s = new Student();
        s.setAge(20);
        s.setName("Piyush");
        Student student = studentService.addStudent(s);
        return  student;
    }
}
