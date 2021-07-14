package com.dbtest.demotest.controller;

import com.dbtest.demotest.model.CasinoBuilding;
import com.dbtest.demotest.model.DTO.WorkerDTO;
import com.dbtest.demotest.model.SlotMachine;
import com.dbtest.demotest.model.Worker;
import com.dbtest.demotest.model.Worker;
import com.dbtest.demotest.model.mapper.DTOToEntity;
import com.dbtest.demotest.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class WorkerController extends LinkController<Worker, CasinoBuilding> {

    @Autowired
    public WorkerController(WorkerRepository workerRepository){
        this.repository = workerRepository;
    }

    @PostMapping(value = "/Worker")
    public ResponseEntity<?> createCasinoBuilding(@RequestBody WorkerDTO workerDTO){
        Worker result = DTOToEntity.WorkerFromDTO(workerDTO);

        Integer fkcasino_id = workerDTO.getFk_casino_id();
        ResponseEntity<?> responseEntity = this.getLinkedObjectById(fkcasino_id);
        if (responseEntity.getStatusCode() == HttpStatus.NOT_FOUND){
            return new ResponseEntity<> (HttpStatus.FAILED_DEPENDENCY);
        }
        else
        {
            CasinoBuilding casinoBuilding = (CasinoBuilding) responseEntity.getBody();
            result.setCasinoBuildingWorker(casinoBuilding);
            return this.create(result);
        }
    }
    @GetMapping(value = "/Worker")
    public ResponseEntity<List<Worker>> readCasinoBuildings(){
        return this.read();
    }
    @GetMapping(value = "/Worker/{id}")
    public ResponseEntity<Worker> readCasinoBuildingById(@PathVariable(name = "id") int id) {
        return read((id));
    }
    @PutMapping(value = "/Worker/{id}")
    public ResponseEntity<?> updateCasinoBuilding(@PathVariable(name = "id") int id, @RequestBody Worker worker) {
        ResponseEntity<?> responseEntity = update(id, worker);
        if (responseEntity.equals(HttpStatus.OK))
            worker.setId(id);
        return responseEntity;
    }
    @DeleteMapping(value = "/Worker/{id}")
    public ResponseEntity<?> deleteCasinoBuildingById(@PathVariable(name = "id") int id) {
        return delete(id);
    }

}
