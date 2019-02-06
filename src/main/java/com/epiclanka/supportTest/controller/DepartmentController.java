package com.epiclanka.supportTest.controller;

import com.epiclanka.supportTest.model.Department;
import com.epiclanka.supportTest.model.User;
import com.epiclanka.supportTest.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/admin/department")
public class DepartmentController {
    @Autowired private DepartmentRepository departmentRepository;

    @RequestMapping("/save")
    public Department save(@RequestBody Department department){
        return departmentRepository.save(department);
    }

    @RequestMapping("/findAll")
    public List<Department> findAll(){
        return  departmentRepository.findAll();
    }
}
