package com.example.model.rentalService;

import jakarta.persistence.Entity;

import java.util.Set;

@Entity
class House extends RentalAndService {

    private String standard;
    private String description;

    private Integer floors;

    public House(Integer id, Integer area, Double rentalCost, Integer maxGuests, String name, String rentType, Set<AdditionalAndService> additionalAndServices, String standard, String description, Integer floors) {
        super(id, area, rentalCost, maxGuests, name, rentType, additionalAndServices);
        this.standard = standard;
        this.description = description;
        this.floors = floors;
    }

    public House(String standard, String description, Integer floors) {
        this.standard = standard;
        this.description = description;
        this.floors = floors;
    }

    public House(){
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }
}
