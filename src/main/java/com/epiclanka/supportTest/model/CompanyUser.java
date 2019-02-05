package com.epiclanka.supportTest.model;

import javax.persistence.*;

@Entity
@Table( name = "companyUser")
public class CompanyUser {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String userName;
    private String email;
    private String Company;
    private String phone;
    private String mobile;
    private String password;
    private String userRole;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,
            CascadeType.REFRESH})
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,
            CascadeType.REFRESH})
    @JoinColumn(name = "team_id")
    private Team team;

    //Supervisor
    //department
    //team

}
