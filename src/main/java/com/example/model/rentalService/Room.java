package com.example.model.rentalService;

import jakarta.persistence.Entity;

import java.util.Set;

@Entity
class Room extends RentalAndService {
    private String freeServices;

    public Room(Integer id, Integer area, Double rentalCost, Integer maxGuests, String name, String rentType, Set<AdditionalAndService> additionalAndServices, String freeServices) {
        super(id, area, rentalCost, maxGuests, name, rentType, additionalAndServices);
        this.freeServices = freeServices;
    }

    public Room(String freeServices) {
        this.freeServices = freeServices;
    }

    public Room(){

     }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }
}