package com.example.model.customer;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dob;

    public enum Gender {
        MALE,
        FEMALE
    }

    private String idCardNumber;
    private String phoneNumber;
    private String email;

    public enum CustomerType {
        DIAMOND,
        PLATINUM,
        GOLD,
        SILVER,
        MEMBER
    }

    private String address;

    @OneToOne(mappedBy = "customer")
    private RentalContract rentalContract;

    public Customer(Long id, String name, LocalDate dob, String idCardNumber, String phoneNumber, String email, String address, RentalContract rentalContract) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.idCardNumber = idCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.rentalContract = rentalContract;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RentalContract getRentalContract() {
        return rentalContract;
    }

    public void setRentalContract(RentalContract rentalContract) {
        this.rentalContract = rentalContract;
    }
}