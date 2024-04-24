package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository employeeRepository;

    @Override
    public List < Student > getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Student employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public Student getEmployeeById(long id) {
        Optional < Student > optional = employeeRepository.findById(id);
        Student employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(long id) {
        this.employeeRepository.deleteById(id);
    }
}
