package com.epiclanka.supportTest.service;

import com.epiclanka.supportTest.model.Product;
import com.epiclanka.supportTest.model.Product_Module;

import java.util.Set;

public interface ProductService {

    void createProduct(Product product, Set<Product_Module> productModule);

}
