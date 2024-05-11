package com.example.model.rentalService;

import jakarta.persistence.Entity;

import java.util.Set;

@Entity
class Villa extends RentalAndService {

    private String standard;
    private String description;
    private Double poolArea;
    private Integer floors;


    public Villa(){
    }

    public Villa(Integer id, Integer area, Double rentalCost, Integer maxGuests, String name, String rentType, Set<AdditionalAndService> additionalAndServices, String standard, String description, Double poolArea, Integer floors) {
        super(id, area, rentalCost, maxGuests, name, rentType, additionalAndServices);
        this.standard = standard;
        this.description = description;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public Villa(String standard, String description, Double poolArea, Integer floors) {
        this.standard = standard;
        this.description = description;
        this.poolArea = poolArea;
        this.floors = floors;
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

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }
}
