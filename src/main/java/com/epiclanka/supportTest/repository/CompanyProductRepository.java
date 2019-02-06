package com.epiclanka.supportTest.repository;

import com.epiclanka.supportTest.model.ClientCompany;
import com.epiclanka.supportTest.model.CompanyProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyProductRepository extends JpaRepository<CompanyProduct, Long> {

}
