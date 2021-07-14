package com.dbtest.demotest.controller;

import com.dbtest.demotest.model.CasinoBuilding;
import com.dbtest.demotest.model.Company;
import com.dbtest.demotest.model.DTO.CasinoBuildingDTO;
import com.dbtest.demotest.model.Worker;
import com.dbtest.demotest.model.mapper.DTOToEntity;
import com.dbtest.demotest.repository.CasinoBuildingRepository;
import com.dbtest.demotest.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CasinoBuildingController extends LinkController<CasinoBuilding, Company> {
    @Autowired
    public CasinoBuildingController(CasinoBuildingRepository casinoBuildingRepository, CompanyRepository companyRepository) {
        this.repository = casinoBuildingRepository;
        this.linkRepository = companyRepository;
    }



    @PostMapping(value = "/CasinoBuilding")
    public ResponseEntity<?> createCasinoBuilding(@RequestBody CasinoBuildingDTO casinoBuildingDTO){
        CasinoBuilding result = DTOToEntity.CasinoBuildingFromDTO(casinoBuildingDTO);
        Integer fk_company_id = casinoBuildingDTO.getFk_company_id();
        ResponseEntity<?> responseEntity = this.getLinkedObjectById(fk_company_id);
        Company company = (Company) responseEntity.getBody();
        result.setCBcompany(company);
        return this.create(result);
    }
    @GetMapping(value = "/CasinoBuilding")
    public ResponseEntity<List<CasinoBuilding>> readCasinoBuildings(){
        return this.read();
    }
    @GetMapping(value = "/CasinoBuilding/{id}")
    public ResponseEntity<CasinoBuilding> readCasinoBuildingById(@PathVariable(name = "id") int id) {
        return read((id));
    }
    @PutMapping(value = "/CasinoBuilding/{id}")
    public ResponseEntity<?> updateCasinoBuilding(@PathVariable(name = "id") int id, @RequestBody CasinoBuilding casinoBuilding) {
        ResponseEntity<?> responseEntity = update(id, casinoBuilding);
        if (responseEntity.equals(HttpStatus.OK))
            casinoBuilding.setId(id);
        return responseEntity;
    }
    @DeleteMapping(value = "/CasinoBuilding/{id}")
    public ResponseEntity<?> deleteCasinoBuildingById(@PathVariable(name = "id") int id) {
            return delete(id);
    }

}
