package com.epiclanka.supportTest.repository;

import com.epiclanka.supportTest.model.Department;
import com.epiclanka.supportTest.model.Module;
import com.epiclanka.supportTest.model.Product_Module;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ModuleRepository extends JpaRepository<Module, Long> {
    Module findByModuleName(String name);
}
