package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Student;

public interface StudentService{
    List < Student > getAllEmployees();
    void saveEmployee(Student employee);
    Student getEmployeeById(long id);
    void deleteEmployeeById(long id);
}