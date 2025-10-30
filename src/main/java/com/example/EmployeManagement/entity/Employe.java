package com.example.EmployeManagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="employe_management")
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private int id;

private String firstname;

private String lastname;

private double salary;

@Embedded
    private Department department;

}
