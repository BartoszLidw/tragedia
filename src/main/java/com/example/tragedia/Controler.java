package com.example.tragedia;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class Controler {
    private final Repository repository;

    public Controler(Repository repository) {
        this.repository = repository;
    }

    @GetMapping("/course")
    public ResponseEntity<Collection<Alarm>> getAllClasses() {
        return ResponseEntity.ok(repository.alarms().values());
    }
    @GetMapping("/course/{id}")
    public ResponseEntity<Alarm> getClass(@PathVariable Long id) {
        return ResponseEntity.ok(repository.alarms().get(id));
    }
}
