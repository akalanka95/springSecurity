package com.epiclanka.supportTest.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table( name = "company" )
public class Company {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String companyName;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private Set<Company_Product_Module> company_product_modules = new HashSet<>();

    public Set<Company_Product_Module> getCompany_product_modules() {
        return company_product_modules;
    }

    public void setCompany_product_modules(Set<Company_Product_Module> company_product_modules) {
        this.company_product_modules = company_product_modules;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
