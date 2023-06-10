package com.shorterpost.jpastreamerexample.repository;

import com.shorterpost.jpastreamerexample.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
