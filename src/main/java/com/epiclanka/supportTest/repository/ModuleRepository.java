package com.epiclanka.supportTest.repository;

import com.epiclanka.supportTest.model.Department;
import com.epiclanka.supportTest.model.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<Module, Long> {

}
