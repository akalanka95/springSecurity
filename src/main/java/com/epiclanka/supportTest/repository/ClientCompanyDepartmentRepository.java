package com.epiclanka.supportTest.repository;

import com.epiclanka.supportTest.model.ClientCompany;
import com.epiclanka.supportTest.model.ClientCompanyDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientCompanyDepartmentRepository extends JpaRepository<ClientCompanyDepartment, Long> {
}
