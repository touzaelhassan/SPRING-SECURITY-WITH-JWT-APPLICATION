package com.application.entities;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String reference;
    private String description;
    private Float price;
    private Integer quantity;

    public Product() { }

    public Product( String name, String reference, String description, Float price, Integer quantity) {

        this.name = name;
        this.reference = reference;
        this.description = description;
        this.price = price;
        this.quantity = quantity;

    }

    public void setId(Integer id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setReference(String reference) { this.reference = reference; }
    public void setDescription(String description) { this.description = description; }
    public void setPrice(Float price) { this.price = price; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public Integer getId() { return id; }
    public String getName() { return name; }
    public String getReference() { return reference; }
    public String getDescription() { return description; }
    public Float getPrice() { return price; }
    public Integer getQuantity() { return quantity; }

}
