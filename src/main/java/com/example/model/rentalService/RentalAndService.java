package com.example.model.rentalService;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class RentalAndService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer area;

    private Double rentalCost;

    private Integer maxGuests;

    private String name;

    private String rentType;



    @ManyToMany
    @JoinTable(name = "rental_service_additional_service",
            joinColumns = @JoinColumn(name = "rental_service_id"),
            inverseJoinColumns = @JoinColumn(name = "additional_service_id")
    )
    private Set<AdditionalAndService> additionalAndServices = new HashSet<>();


    public RentalAndService(Integer id, Integer area, Double rentalCost, Integer maxGuests, String name, String rentType, Set<AdditionalAndService> additionalAndServices) {
        this.id = id;
        this.area = area;
        this.rentalCost = rentalCost;
        this.maxGuests = maxGuests;
        this.name = name;
        this.rentType = rentType;
        this.additionalAndServices = additionalAndServices;
    }

    public RentalAndService() {
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(Double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public Set<AdditionalAndService> getAdditionalServices() {
        return additionalAndServices;
    }

    public void setAdditionalServices(Set<AdditionalAndService> additionalAndServices) {
        this.additionalAndServices = additionalAndServices;
    }

    public Integer getMaxGuests() {
        return maxGuests;
    }

    public void setMaxGuests(Integer maxGuests) {
        this.maxGuests = maxGuests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRentType() {
        return rentType;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
