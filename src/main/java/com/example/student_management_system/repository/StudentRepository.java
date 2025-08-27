package com.example.student_management_system.repository;

import com.example.student_management_system.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

// JPARepository takes in two parameters which are: The Type of the JPA Entity (that you created) and the Type of the primary key
public interface StudentRepository extends JpaRepository<Student, Long> {

}
