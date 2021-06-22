package com.cts.training.trainingrestapp.repos;

import java.util.List;

import com.cts.training.trainingrestapp.model.Trainer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepo extends JpaRepository<Trainer, Integer>{

    List<Trainer> findByName(String name);

    List<Trainer> findByTechnology(String technology);
    
}
