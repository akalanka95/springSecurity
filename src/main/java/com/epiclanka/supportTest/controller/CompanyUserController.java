package com.epiclanka.supportTest.controller;

import com.epiclanka.supportTest.model.CompanyUser;
import com.epiclanka.supportTest.model.Department;
import com.epiclanka.supportTest.repository.CompanyUserRepository;
import com.epiclanka.supportTest.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/admin/companyUser")
public class CompanyUserController {
    @Autowired
    private CompanyUserRepository companyUserRepository;

    @RequestMapping("/save")
    public CompanyUser save(@RequestBody CompanyUser companyUser){
        return companyUserRepository.save(companyUser);
    }

    @RequestMapping("/findAll")
    public List<CompanyUser> findAll(){
        return  companyUserRepository.findAll();
    }
}
