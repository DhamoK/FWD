package com.torryharris.Freshworldgrocery.model;

import javax.persistence.*;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int product_id;

    @Column(nullable = false, length = 100, name = "product_name")
    private String productName;

    @Column(nullable = false, length = 150, name = "productCategory")
    private String productCategory;


    @Column(nullable = false, length = 50, name = "price")
    private double price;

/*public Properties() {
        super();
    }*/

    /*public Properties(String propName, String address, String details, double price) {
        this.propName = propName;
        this.address = address;
        this.details = details;
        this.price = price;
    }*/

    /*public Properties(int property_id, String propName, String address, String details, double price) {
        this.property_id = property_id;
        this.propName = propName;
        this.address = address;
        this.details = details;
        this.price = price;
    }*/

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
/* public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }*/
}