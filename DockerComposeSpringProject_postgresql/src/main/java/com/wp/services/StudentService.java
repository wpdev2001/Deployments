package com.wp.services;

import com.wp.entities.Student;
import com.wp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<Student> getStudents(){
        return repository.findAll();
    }

    public Student addStudent(Student s) {
        return repository.save(s);
    }
}
