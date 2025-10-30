package com.example.EmployeManagement.dto;

import com.example.EmployeManagement.entity.Department;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class EmployeDto {

    private int id;
    private String firstname;
    private String lastname;
    private double salary;
    private Department department;

}
