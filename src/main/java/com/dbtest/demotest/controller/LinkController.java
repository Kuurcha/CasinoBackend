package com.dbtest.demotest.controller;

import com.dbtest.demotest.model.CasinoBuilding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class LinkController<T,T1>  extends  BaseDBController<T>{
    JpaRepository<T1, Integer> linkRepository;
    public ResponseEntity<T1> getLinkedObjectById(int id) {
        final T1 result = (T1) linkRepository.getById(id);
        return result != null
                ? new ResponseEntity<>(result, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
}
