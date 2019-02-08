package com.epiclanka.supportTest.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table( name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String productName;
    private String type;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private Set<Product_Module> productModules = new HashSet<>();


    public Set<Product_Module> getProductModules() {
        return productModules;
    }

    public void setProductModules(Set<Product_Module> productModules) {
        this.productModules = productModules;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
