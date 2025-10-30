package com.example.EmployeManagement.repository;

import com.example.EmployeManagement.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeReopository extends JpaRepository<Employe,Integer> {


}
