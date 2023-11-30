package com.example.www_lab7.backend.repositories;

import com.example.www_lab7.backend.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}