package com.example.EmployeManagement.controller;


import com.example.EmployeManagement.dto.EmployeDto;
import com.example.EmployeManagement.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/EmployeDB")
public class EmployeController {

    @Autowired
    private EmployeService employeService;


    @PostMapping
    public ResponseEntity<EmployeDto> createEmploye(@RequestBody EmployeDto employeDto) {
        EmployeDto created = employeService.createEmploye(employeDto);
        return ResponseEntity.ok(created);
    }


}
