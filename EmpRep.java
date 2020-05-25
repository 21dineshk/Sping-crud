package com.ensemble.employeeAssign.repository;

import com.ensemble.employeeAssign.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRep extends JpaRepository<Employee,Integer> {
}
