package com.epiclanka.supportTest.repository;


import com.epiclanka.supportTest.model.CompanyUser;
import com.epiclanka.supportTest.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
