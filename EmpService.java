package com.ensemble.employeeAssign.service;

import com.ensemble.employeeAssign.model.Employee;
import com.ensemble.employeeAssign.repository.EmpRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    private EmpRep rep;

    public List<Employee> getAllEmp(){
        return rep.findAll();
    }

    public void loadEmp(Employee e) {
        rep.save(e);
    }

    public Optional<Employee> getEmpById(int empId) {
        return rep.findById(empId);
    }

    public void updateEmp(Employee e,int empId) {
        rep.save(e);
    }

    public void deleteEmp(Employee e,int empId) {
        rep.delete(e);
    }
}
