package com.will_code.studentsystem.service;

import com.will_code.studentsystem.model.Student;

import java.util.List;


public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
}
