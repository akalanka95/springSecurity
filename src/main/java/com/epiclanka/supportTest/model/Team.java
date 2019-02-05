package com.epiclanka.supportTest.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "team")
public class Team {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String teamName;
    private String teamDescription;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,
            CascadeType.REFRESH})
    @JoinColumn(name = "department_id")
    private Department department;

    @OneToMany(mappedBy = "team",
            cascade = {CascadeType.DETACH,CascadeType.MERGE,
                    CascadeType.REFRESH})
    private List<CompanyUser> companyUser;

    public List<CompanyUser> getCompanyUser() {
        return companyUser;
    }

    public void setCompanyUser(List<CompanyUser> companyUser) {
        this.companyUser = companyUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamDescription() {
        return teamDescription;
    }

    public void setTeamDescription(String teamDescription) {
        this.teamDescription = teamDescription;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
