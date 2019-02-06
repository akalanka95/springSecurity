package com.epiclanka.supportTest.controller;

import com.epiclanka.supportTest.model.Client;
import com.epiclanka.supportTest.model.ClientCompanyDepartment;
import com.epiclanka.supportTest.repository.ClientCompanyDepartmentRepository;
import com.epiclanka.supportTest.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/admin/client")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping("/save")
    public Client save(@RequestBody Client client){
        return clientRepository.save(client);
    }

    @RequestMapping("/findAll")
    public List<Client> findAll(){
        return  clientRepository.findAll();
    }
}
