package com.dbtest.demotest.service;

import com.dbtest.demotest.model.RPG;
import com.dbtest.demotest.repository.RpgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class RPGServiceImp implements RPGService {

    //@Autowired
   //private RpgRepository rpgRepository;
    private final RpgRepository rpgRepository;

    public RPGServiceImp (RpgRepository rpgRepository) {
        this.rpgRepository = rpgRepository;
    }
    @Override
    public void create(RPG rpg) {
        rpgRepository.save(rpg);
    }
    @Override
    public List<RPG> readAll() {
        return rpgRepository.findAll();
    }
    @Override
    public RPG read(int id) {

        return rpgRepository.getOne(id);
    }
    @Override
    public boolean update(RPG rpg, int id) {
        if (rpgRepository.existsById(id)) {
            rpg.setId((id));
            rpgRepository.save((rpg));
            return true;
        }

        return false;
    }
    @Override
    public boolean delete(int id) {
        if (rpgRepository.existsById(id)) {
            rpgRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
