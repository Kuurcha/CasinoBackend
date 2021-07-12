package com.dbtest.demotest.controller;

import com.dbtest.demotest.model.CasinoBuilding;
import com.dbtest.demotest.model.Company;
import com.dbtest.demotest.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CompanyController extends BaseDBController<Company>{
    @Autowired
    public CompanyController(CompanyRepository companyRepository){
        this.repository = companyRepository;
    }
    @PostMapping(value = "/Company")
    public ResponseEntity<?> createCasinoBuilding(@RequestBody Company company){
        return this.create(company);
    }
    @GetMapping(value = "/Company")
    public ResponseEntity<List<Company>> readCasinoBuildings(){
        return this.read();
    }
    @GetMapping(value = "/Company/{id}")
    public ResponseEntity<Company> readCasinoBuildingById(@PathVariable(name = "id") int id) {
        return read((id));
    }
    @PutMapping(value = "/Company/{id}")
    public ResponseEntity<?> updateCasinoBuilding(@PathVariable(name = "id") int id, @RequestBody Company company) {
        ResponseEntity<?> responseEntity = update(id, company);
        if (responseEntity.equals(HttpStatus.OK))
            company.setId(id);
        return responseEntity;
    }
    @DeleteMapping(value = "/Company/{id}")
    public ResponseEntity<?> deleteCasinoBuildingById(@PathVariable(name = "id") int id) {
        return delete(id);
    }
}
