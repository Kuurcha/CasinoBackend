package com.dbtest.demotest.service;

import com.dbtest.demotest.model.RPG;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class RPGServiceImp implements RPGService {
    private static final Map<Integer, RPG> RPG_REPOSITORY_MAP = new HashMap<>();
    private static final AtomicInteger RPG_ID_HOLDER = new AtomicInteger();

    @Override
    public void create(RPG rpg) {
        final int rpgId =  RPG_ID_HOLDER.incrementAndGet();
        rpg.setId(rpgId);
        RPG_REPOSITORY_MAP.put(rpgId, rpg);
    }
    @Override
    public List<RPG> readAll() {
        return new ArrayList<>(RPG_REPOSITORY_MAP.values());
    }
    @Override
    public RPG read(int id) {
        return RPG_REPOSITORY_MAP.get(id);
    }
    @Override
    public boolean update(RPG rpg, int id) {
        if (RPG_REPOSITORY_MAP.containsKey(id)) {
            rpg.setId(id);
            RPG_REPOSITORY_MAP.put(id, rpg);
            return true;
        }

        return false;
    }
    @Override
    public boolean delete(int id) {
        return RPG_REPOSITORY_MAP.remove(id) != null;
    }
}
