package com.epiclanka.supportTest.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String departmentName;

    @OneToMany(mappedBy = "department",
            cascade = {CascadeType.DETACH,CascadeType.MERGE,
                    CascadeType.REFRESH})
    private List<Team> team;

    @OneToMany(mappedBy = "department",
            cascade = {CascadeType.DETACH,CascadeType.MERGE,
                    CascadeType.REFRESH})
    private List<CompanyUser> companyUser;


    public List<CompanyUser> getCompanyUser() {
        return companyUser;
    }

    public void setCompanyUser(List<CompanyUser> companyUser) {
        this.companyUser = companyUser;
    }

    public List<Team> getTeam() {
        return team;
    }

    public void setTeam(List<Team> team) {
        this.team = team;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
