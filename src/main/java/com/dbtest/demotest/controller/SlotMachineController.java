package com.dbtest.demotest.controller;

import com.dbtest.demotest.model.SlotMachine;
import com.dbtest.demotest.model.SlotMachine;
import com.dbtest.demotest.repository.SlotMachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5432")
public class SlotMachineController extends BaseDBController<SlotMachine>{
    @Autowired
    public  SlotMachineController(SlotMachineRepository slotMachineRepository){
        this.repository = slotMachineRepository;
    }
    @PostMapping(value = "/SlotMachine")
    public ResponseEntity<?> createCasinoBuilding(@RequestBody SlotMachine company){
        return this.create(company);
    }
    @GetMapping(value = "/SlotMachine")
    public ResponseEntity<List<SlotMachine>> readCasinoBuildings(){
        return this.read();
    }
    @GetMapping(value = "/SlotMachine/{id}")
    public ResponseEntity<SlotMachine> readCasinoBuildingById(@PathVariable(name = "id") int id) {
        return read((id));
    }
    @PutMapping(value = "/SlotMachine/{id}")
    public ResponseEntity<?> updateCasinoBuilding(@PathVariable(name = "id") int id, @RequestBody SlotMachine slotMachine) {
        ResponseEntity<?> responseEntity = update(id, slotMachine);
        if (responseEntity.equals(HttpStatus.OK))
            slotMachine.setId(id);
        return responseEntity;
    }
    @DeleteMapping(value = "/SlotMachine/{id}")
    public ResponseEntity<?> deleteCasinoBuildingById(@PathVariable(name = "id") int id) {
        return delete(id);
    }
}
