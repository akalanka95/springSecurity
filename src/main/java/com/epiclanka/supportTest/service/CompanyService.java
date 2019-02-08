package com.epiclanka.supportTest.service;

import com.epiclanka.supportTest.model.Company;
import com.epiclanka.supportTest.model.Company_Product_Module;
import com.epiclanka.supportTest.model.Product;
import com.epiclanka.supportTest.model.Product_Module;

import java.util.Set;

public interface CompanyService {
    void createCompany(Company company,
                       Set<Product_Module> product_modules,
                       Product product);
}
