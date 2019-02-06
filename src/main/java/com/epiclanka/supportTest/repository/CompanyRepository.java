package com.epiclanka.supportTest.repository;

import com.epiclanka.supportTest.model.Client;
import com.epiclanka.supportTest.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
