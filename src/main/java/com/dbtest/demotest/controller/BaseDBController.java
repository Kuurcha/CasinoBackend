package com.dbtest.demotest.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5432")
public abstract class BaseDBController<T> {
    JpaRepository<T, Integer> repository;



    public ResponseEntity<?> create(T ModelBase) {
        repository.save(ModelBase);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    public ResponseEntity<List<T>> read() {
        final List<T> ModelBases = repository.findAll();

        return ModelBases  != null &&  !ModelBases.isEmpty()
                ? new ResponseEntity<>(ModelBases, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    public ResponseEntity<T> read(int id) {
        final T client = (T) repository.getById(id);

        return client != null
                ? new ResponseEntity<>(client, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
    public ResponseEntity<?> update(int id, T modelBase) {
        boolean updated = false;
        if (repository.existsById(id)) {
            repository.save((modelBase));
           updated = true;
        }
        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    public ResponseEntity<?> delete(int id) {
        boolean deleted = false;
        if (repository.existsById(id)) {
            repository.deleteById(id);
            deleted = true;
        }
        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }


}
