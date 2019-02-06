package com.epiclanka.supportTest.controller;

import com.epiclanka.supportTest.model.CompanyProduct;
import com.epiclanka.supportTest.model.CompanyUser;
import com.epiclanka.supportTest.repository.CompanyProductRepository;
import com.epiclanka.supportTest.repository.CompanyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/admin/companyProduct")
public class CompanyProductController {
    @Autowired
    private CompanyProductRepository companyProductRepository;

    @RequestMapping("/save")
    public CompanyProduct save(@RequestBody CompanyProduct companyProduct){
        return companyProductRepository.save(companyProduct);
    }

    @RequestMapping("/findAll")
    public List<CompanyProduct> findAll(){
        return  companyProductRepository.findAll();
    }
}
