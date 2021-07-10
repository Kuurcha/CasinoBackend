package com.dbtest.demotest.repository;


import com.dbtest.demotest.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer>{
}
