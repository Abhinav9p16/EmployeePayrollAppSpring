package com.cg.employeepayrollapp.controller;

//import org.springframework.*;

import com.cg.employeepayrollapp.dto.EmployeePayrollDTO;
import com.cg.employeepayrollapp.dto.ResponseDTO;
import com.cg.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, new EmployeePayrollDTO("Pankaj", 30000));
        ResponseDTO respDTO = new ResponseDTO("Get Call Successful ", empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable(value = "empId") int empId) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, new EmployeePayrollDTO("Pankaj", 30000));
        ResponseDTO respDTO = new ResponseDTO("Get Call For ID Successful ", empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, employeePayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Created Employee Payroll Data Successfully ", empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, employeePayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated Employee Payroll Data Successfully ", empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
        ResponseDTO respDTO = new ResponseDTO("Deleted Successfully ", empId);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
}
