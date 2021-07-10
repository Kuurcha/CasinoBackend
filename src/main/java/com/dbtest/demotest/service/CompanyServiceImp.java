//package com.dbtest.demotest.service;

import com.dbtest.demotest.model.Company;
import com.dbtest.demotest.repository.CompanyRepository;

import org.springframework.stereotype.Service;

import java.util.List;

/*
public class CompanyServiceImp implements IBaseService<Company> {
    private final CompanyRepository companyRepository;

    public CompanyServiceImp (CompanyRepository companyRepository) {
      this.companyRepository = companyRepository;
    }
    @Override
    public void create(Company rpg) {
        companyRepository.save(rpg);
    }
    @Override
    public List<Company> readAll() {
        return companyRepository.findAll();
    }
    @Override
    public Company read(int id) {

        return companyRepository.getOne(id);
    }
    @Override
    public boolean update(Company rpg, int id) {
        if (companyRepository.existsById(id)) {
            rpg.setId((id));
            companyRepository.save((rpg));
            return true;
        }

        return false;
    }
    @Override
    public boolean delete(int id) {
        if (companyRepository.existsById(id)) {
            companyRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
*/