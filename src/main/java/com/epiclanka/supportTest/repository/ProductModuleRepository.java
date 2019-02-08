package com.epiclanka.supportTest.repository;

import com.epiclanka.supportTest.model.Product_Module;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductModuleRepository extends CrudRepository<Product_Module, Long> {
    Optional<Product_Module> findById(Long id);
}
