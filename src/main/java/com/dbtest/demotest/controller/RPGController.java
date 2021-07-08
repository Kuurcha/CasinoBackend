package com.dbtest.demotest.controller;

import com.dbtest.demotest.model.RPG;
import com.dbtest.demotest.service.RPGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5432")
public class RPGController {
    private final RPGService rpgService;

    @Autowired
    public RPGController(RPGService rpgService) {
        this.rpgService =  rpgService;
    }
    @PostMapping(value = "/RPG")
    public ResponseEntity<?> create(@RequestBody RPG RPG) {
        rpgService.create(RPG);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(value = "/RPG")
    public ResponseEntity<List<RPG>> read() {
        final List<RPG> RPGs = rpgService.readAll();

        return RPGs != null &&  !RPGs.isEmpty()
                ? new ResponseEntity<>(RPGs, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @GetMapping(value = "/RPG/{id}")
    public ResponseEntity<RPG> read(@PathVariable(name = "id") int id) {
        final RPG client = rpgService.read(id);

        return client != null
                ? new ResponseEntity<>(client, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PutMapping(value = "/RPG/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody RPG rpg) {
        final boolean updated = rpgService.update(rpg, id);
        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/RPG/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = rpgService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

}
