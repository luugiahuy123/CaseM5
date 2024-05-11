package com.example.model.rentalService;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class AdditionalAndService {

    private String name;
    private String unit;
    private Double price;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToMany(mappedBy = "additionalServices")
    private Set<RentalAndService> rentalAndServices = new HashSet<>();



    public AdditionalAndService(String name, String unit, Double price, Integer id) {
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.id = id;
    }

    public AdditionalAndService() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
