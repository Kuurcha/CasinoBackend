package com.dbtest.demotest.repository;

import com.dbtest.demotest.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {
}
