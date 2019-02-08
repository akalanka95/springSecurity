package com.epiclanka.supportTest.model;

import javax.persistence.*;


@Entity
@Table( name = "Company_product_module")
public class Company_Product_Module {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne(fetch = FetchType.EAGER)
    private Product_Module product_module;

    private String brand;
    private String model;
    private String serialNo;
    private String modelNo;
    private String description;
    private String version;


    public Company_Product_Module() {
    }

    public Company_Product_Module(Company company, Product_Module product_module) {
        this.company = company;
        this.product_module = product_module;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Product_Module getProduct_module() {
        return product_module;
    }

    public void setProduct_module(Product_Module product_module) {
        this.product_module = product_module;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
