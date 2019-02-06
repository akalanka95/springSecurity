package com.epiclanka.supportTest.model;

import javax.persistence.*;

@Entity
@Table( name = "clientCompanyDepartment")
public class ClientCompanyDepartment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String clientCompanyDepartmentName;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,
            CascadeType.REFRESH})
    @JoinColumn(name = "clientCompany_id")
    private ClientCompany clientCompany;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientCompanyDepartmentName() {
        return clientCompanyDepartmentName;
    }

    public void setClientCompanyDepartmentName(String clientCompanyDepartmentName) {
        this.clientCompanyDepartmentName = clientCompanyDepartmentName;
    }

    public ClientCompany getClientCompany() {
        return clientCompany;
    }

    public void setClientCompany(ClientCompany clientCompany) {
        this.clientCompany = clientCompany;
    }
}
