package com.epiclanka.supportTest.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "clientCompany")
public class ClientCompany {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String clientCompanyName;
    private String clientCompanyDescription;

    @OneToMany(mappedBy = "clientCompany",
            cascade = {CascadeType.DETACH,CascadeType.MERGE,
                    CascadeType.REFRESH})
    private List<ClientCompanyDepartment> clientCompanyDepartments;

    public List<ClientCompanyDepartment> getClientCompanyDepartments() {
        return clientCompanyDepartments;
    }

    public void setClientCompanyDepartments(List<ClientCompanyDepartment> clientCompanyDepartments) {
        this.clientCompanyDepartments = clientCompanyDepartments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientCompanyName() {
        return clientCompanyName;
    }

    public void setClientCompanyName(String clientCompanyName) {
        this.clientCompanyName = clientCompanyName;
    }

    public String getClientCompanyDescription() {
        return clientCompanyDescription;
    }

    public void setClientCompanyDescription(String clientCompanyDescription) {
        this.clientCompanyDescription = clientCompanyDescription;
    }
}
