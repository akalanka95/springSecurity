package com.epiclanka.supportTest.controller;

import com.epiclanka.supportTest.model.ClientCompany;
import com.epiclanka.supportTest.model.CompanyUser;
import com.epiclanka.supportTest.repository.ClientCompanyRepository;
import com.epiclanka.supportTest.repository.CompanyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/admin/clientCompany")
public class ClientCompanyController {
    @Autowired
    private ClientCompanyRepository clientCompanyRepository;

    @RequestMapping("/save")
    public ClientCompany save(@RequestBody ClientCompany clientCompany){
        return clientCompanyRepository.save(clientCompany);
    }

    @RequestMapping("/findAll")
    public List<ClientCompany> findAll(){
        return  clientCompanyRepository.findAll();
    }
}
