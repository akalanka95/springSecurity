package com.epiclanka.supportTest.repository;

import com.epiclanka.supportTest.model.Client;
import com.epiclanka.supportTest.model.ClientCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
