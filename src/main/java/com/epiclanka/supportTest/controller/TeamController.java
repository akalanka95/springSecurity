package com.epiclanka.supportTest.controller;

import com.epiclanka.supportTest.model.Department;
import com.epiclanka.supportTest.model.Team;
import com.epiclanka.supportTest.repository.DepartmentRepository;
import com.epiclanka.supportTest.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/admin/team")
public class TeamController {
    @Autowired
    private TeamRepository teamRepository;

    @RequestMapping("/save")
    public Team save(@RequestBody Team team){
        return teamRepository.save(team);
    }

    @RequestMapping("/findAll")
    public List<Team> findAll(){
        return  teamRepository.findAll();
    }
}
