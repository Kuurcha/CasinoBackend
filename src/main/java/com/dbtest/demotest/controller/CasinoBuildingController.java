package com.dbtest.demotest.controller;

import com.dbtest.demotest.model.CasinoBuilding;
import com.dbtest.demotest.repository.CasinoBuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:5432")
public class CasinoBuildingController extends  BaseDBController<CasinoBuilding> {
    @Autowired
    public CasinoBuildingController(CasinoBuildingRepository casinoBuildingRepository) {
        this.repository = casinoBuildingRepository;
    }
    @PostMapping(value = "/CasinoBuilding")
    public ResponseEntity<?> createCasinoBuilding(@RequestBody CasinoBuilding CasinoBuilding){
        return this.create(CasinoBuilding);
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
