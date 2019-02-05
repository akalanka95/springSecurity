package com.epiclanka.supportTest.repository;

import com.epiclanka.supportTest.model.Department;
import com.epiclanka.supportTest.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
