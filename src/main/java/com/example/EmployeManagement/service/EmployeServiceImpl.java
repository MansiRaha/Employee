package com.example.EmployeManagement.service;


import com.example.EmployeManagement.dto.EmployeDto;
import com.example.EmployeManagement.entity.Employe;
import com.example.EmployeManagement.repository.EmployeReopository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeServiceImpl implements EmployeService{

    @Autowired
    private EmployeReopository employeReopository;

    private EmployeDto mapToDto(Employe employe) {
        EmployeDto e = new EmployeDto();
        e.setId(employe.getId());
        e.setFirstname(employe.getFirstname());
        e.setLastname(employe.getLastname());
        e.setSalary(employe.getSalary());
        e.setDepartment(employe.getDepartment());
        return e;
    }

    public static Employe toEntity(EmployeDto e) {
        Employe entity = new Employe();
        entity.setFirstname(e.getFirstname());
        entity.setLastname(e.getLastname());
        entity.setSalary(e.getSalary());
        entity.setDepartment(e.getDepartment());
        return entity;
    }

@Override
    public EmployeDto createEmploye(EmployeDto employeDto) {
        Employe employe = toEntity(employeDto);
        Employe savedEmploye = employeReopository.save(employe);
        EmployeDto savedEmployeDto = mapToDto(savedEmploye);
        return savedEmployeDto;
    }


}
