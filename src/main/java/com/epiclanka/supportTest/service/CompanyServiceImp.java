package com.epiclanka.supportTest.service;

import com.epiclanka.supportTest.model.*;
import com.epiclanka.supportTest.repository.CompanyRepository;
import com.epiclanka.supportTest.repository.ModuleRepository;
import com.epiclanka.supportTest.repository.ProductModuleRepository;
import com.epiclanka.supportTest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service("companyService")
public class CompanyServiceImp implements CompanyService {
    @Autowired
    private ProductModuleRepository productModuleRepository;
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private ModuleRepository moduleRepository;
    @Autowired
    private ProductRepository productRepository;
//    @Transactional
//    @Override
//    public void createCompany(Company company,
//                              Set<Company_Product_Module> company_product_modules,
//                              Set<Product_Module> product_modules,
//                              Product product) {
//
//
//        Set<Company_Product_Module> company_product_modulesSet = new HashSet<>();
//
//        for (Product_Module pm : product_modules) {
//            moduleRepository.save(pm.getModule());
//            company_product_modulesSet.add(new Company_Product_Module(company , pm));
//        }
//
//        product.getProductModules().addAll(product_modules);
//
//        productRepository.save(product);
//
//
//
//
////        for (Company_Product_Module cpm : company_product_modules) {
////            productModuleRepository.save(cpm.getProduct_module());
////        }
////
//       company.getCompany_product_modules().addAll(company_product_modulesSet);
////
//        companyRepository.save(company);
//    }


    @Transactional
    @Override
    public void createCompany(Company company,
                              Set<Product_Module> product_modules,
                              Product product
                              ) {
        Set<Company_Product_Module> company_product_modulesSet = new HashSet<>();

        for (Product_Module pm : product_modules) {

//            Module moduleTest = moduleRepository.findByModuleName(pm.getModule().getModuleName());
//
//            if(moduleTest != null) {
//                //LOG.info("User with username {} already exist. Nothing will be done. ", user.getUsername());
//                System.out.println("Module alreday exits");
//            }else{
//
//            }
            moduleRepository.save(pm.getModule());
            company_product_modulesSet.add(new Company_Product_Module(company , pm));
        }

//        Product productTest = productRepository.findByProductName(product.getProductName());
//        if(productTest != null) {
//            //LOG.info("User with username {} already exist. Nothing will be done. ", user.getUsername());
//            System.out.println("Product alreday exits");
//        }


        product.getProductModules().addAll(product_modules);
        productRepository.save(product);




//        for (Company_Product_Module cpm : company_product_modules) {
//            productModuleRepository.save(cpm.getProduct_module());
//        }
//
        Company companyTest = companyRepository.findByCompanyName(company.getCompanyName());
        company.getCompany_product_modules().addAll(company_product_modulesSet);
//
        companyRepository.save(company);
    }
}
