package com.epiclanka.supportTest.controller;

import com.epiclanka.supportTest.model.ClientCompanyDepartment;
import com.epiclanka.supportTest.model.CompanyUser;
import com.epiclanka.supportTest.repository.ClientCompanyDepartmentRepository;
import com.epiclanka.supportTest.repository.CompanyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/admin/clientCompanyDepartment")
public class ClientCompanyDepartmentController {
    @Autowired
    private ClientCompanyDepartmentRepository clientCompanyDepartmentRepository;

    @RequestMapping("/save")
    public ClientCompanyDepartment save(@RequestBody ClientCompanyDepartment clientCompanyDepartment){
        return clientCompanyDepartmentRepository.save(clientCompanyDepartment);
    }

    @RequestMapping("/findAll")
    public List<ClientCompanyDepartment> findAll(){
        return  clientCompanyDepartmentRepository.findAll();
    }
}
