package com.dbtest.demotest.repository;

import com.dbtest.demotest.model.RPG;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RpgRepository extends JpaRepository<RPG, Integer> {
}
