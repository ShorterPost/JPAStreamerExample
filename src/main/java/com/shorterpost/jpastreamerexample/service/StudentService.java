package com.shorterpost.jpastreamerexample.service;

import com.shorterpost.jpastreamerexample.entity.Student;
import com.shorterpost.jpastreamerexample.entity.Student$;
import com.shorterpost.jpastreamerexample.repository.StudentRepository;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    public StudentRepository repository;

    @Autowired
    JPAStreamer jpaStreamer;

    public List<Student> getStudents()
    {

       return jpaStreamer.stream(Student.class)
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsByAge(int age)
    {

        return jpaStreamer.stream(Student.class)
                .filter(Student$.age.equal(age))
                .collect(Collectors.toList());
    }

    public Student addStudent(Student student) {
        return repository.save(student);
    }
}
