package com.example.model.employee;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dob;
    private String idCardNumber;
    private String phoneNumber;
    private String email;
    private Qualification qualification;
    private Position position;
    private double salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public enum Qualification {
        INTERMEDIATE,
        COLLEGE,
        UNIVERSITY,
        POST_UNIVERSITY
    }

    public enum Position {
        RECEPTIONIST,
        WAITER,
        STAFF,
        SUPERVISOR,
        MANAGER,
        DIRECTOR
    }

    public Employee(Long id, String name, LocalDate dob, String idCardNumber, String phoneNumber, String email, Qualification qualification, Position position, double salary, Department department) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.idCardNumber = idCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.qualification = qualification;
        this.position = position;
        this.salary = salary;
        this.department = department;
    }

    public Employee() {
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

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}