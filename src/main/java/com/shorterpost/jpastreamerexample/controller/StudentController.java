package com.shorterpost.jpastreamerexample.controller;

import com.shorterpost.jpastreamerexample.entity.Student;
import com.shorterpost.jpastreamerexample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    public StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents()
    {
        return studentService.getStudents();
    }
    @GetMapping("/students/age/{age}")
    public List<Student> getStudents(@PathVariable int age)
    {
        return studentService.getStudentsByAge(age);
    }

    @PostMapping("/students/add")
    public Student addStudent(@RequestBody Student student)
    {
        return studentService.addStudent(student);
    }
}
