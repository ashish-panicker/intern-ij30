package com.cts.training.trainingrestapp.controller;

import java.util.List;

import com.cts.training.trainingrestapp.model.Trainer;
import com.cts.training.trainingrestapp.repos.TrainerRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainerRestController {

    @Autowired
    private TrainerRepo trainerRepo;

    @PostMapping("/trainers")
    public ResponseEntity<Trainer> postTrainer(@RequestBody Trainer trainer) {
        var t = trainerRepo.save(trainer);
        return ResponseEntity.status(HttpStatus.CREATED).body(t);

    }

    @GetMapping("/trainers")
    public ResponseEntity<List<Trainer>> getAllTrainers() {
        List<Trainer> list = trainerRepo.findAll();
        return ResponseEntity.accepted().body(list);
    }

    @GetMapping("/trainers/{name}")
    public ResponseEntity<List<Trainer>> getAllTrainersByName(@PathVariable String name) {
        List<Trainer> list = trainerRepo.findByName(name);
        return ResponseEntity.accepted().body(list);
    }

    @DeleteMapping("/trainers/{id}")
    public ResponseEntity<Trainer> deleteTrainer(@PathVariable Integer id) {

        Trainer trainer = trainerRepo.findById(id).orElseThrow();
        trainerRepo.delete(trainer);
        return ResponseEntity.status(HttpStatus.OK).body(trainer);
    }

}
