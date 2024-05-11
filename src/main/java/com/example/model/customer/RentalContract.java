package com.example.model.customer;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class RentalContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String contractNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private double deposit;
    private double totalPayment;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public RentalContract(Long id, String contractNumber, LocalDate startDate, LocalDate endDate, double deposit, double totalPayment, Customer customer) {
        this.id = id;
        this.contractNumber = contractNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
        this.customer = customer;
    }

    public RentalContract() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}