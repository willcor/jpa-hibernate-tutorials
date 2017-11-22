package com.example.hibernatemanytomanydemo.repository;

import com.example.hibernatemanytomanydemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rajeevkumarsingh on 22/11/17.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
