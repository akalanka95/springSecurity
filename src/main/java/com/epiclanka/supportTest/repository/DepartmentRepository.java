package com.epiclanka.supportTest.repository;

import com.epiclanka.supportTest.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department , Long> {
}
