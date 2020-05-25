package com.ensemble.employeeAssign.controller;

import com.ensemble.employeeAssign.model.Employee;
import com.ensemble.employeeAssign.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmpController {

    @Autowired
    private EmpService serv;

    @GetMapping("/employee")
    public List<Employee> getAllEmp(){
        return serv.getAllEmp();
    }
    @PostMapping("/employee")
    public void loadStudents(@RequestBody Employee e) {
        serv.loadEmp(e);
    }
    @GetMapping("/employee/{empId}")
    public Optional<Employee> getEmpById(@PathVariable int empId) {
        return serv.getEmpById(empId);
    }

    @PutMapping("/employee/{empId}")
    public void updateEmp(@RequestBody Employee e,@PathVariable int empId) {
        serv.updateEmp(e,empId);
    }

    @DeleteMapping("/employee/{empId}")
    public void deleteEmp(Employee e,@PathVariable int empId) {
        serv.deleteEmp(e,empId);
    }


}
