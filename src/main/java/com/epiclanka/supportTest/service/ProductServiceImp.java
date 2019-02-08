package com.epiclanka.supportTest.service;

import com.epiclanka.supportTest.model.Product;
import com.epiclanka.supportTest.model.Product_Module;
import com.epiclanka.supportTest.repository.ModuleRepository;
import com.epiclanka.supportTest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;

@Service("productService")
public class ProductServiceImp implements ProductService {

    @Autowired
    private ModuleRepository moduleRepository;
    @Autowired
    private ProductRepository productRepository;

    @Transactional
    @Override
    public void createProduct(Product product, Set<Product_Module> productModule) {
        for (Product_Module pm : productModule) {
            moduleRepository.save(pm.getModule());
        }

        product.getProductModules().addAll(productModule);

        productRepository.save(product);
    }
}
