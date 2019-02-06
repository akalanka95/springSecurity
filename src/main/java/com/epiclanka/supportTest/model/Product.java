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


//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {
//                    CascadeType.PERSIST,
//                    CascadeType.MERGE
//            })
//    @JoinTable(name = "product_module",
//            joinColumns = { @JoinColumn(name = "product_id") },
//            inverseJoinColumns = { @JoinColumn(name = "module_id") })
//    private Set<Module> modules = new HashSet<>();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private Set<Product_Module> productModules;


    public Product(String productName, String type, Set<Product_Module> productModules) {
        this.productName = productName;
        this.type = type;
        this.productModules = productModules;
    }

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
