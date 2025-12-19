package com.example.tutoring.controller;

import com.example.tutoring.model.Tutor;
import com.example.tutoring.service.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tutors")
@CrossOrigin(origins = "http://localhost:5173")
public class TutorController {
    @Autowired
    private TutorService tutorService;

    @GetMapping
    public List<Tutor> getAllTutors() {
        return tutorService.getAllTutors();
    }

    @PostMapping
    public Tutor saveTutor(@RequestBody Tutor tutor) {
        return tutorService.saveTutor(tutor);
    }

    @DeleteMapping("/{id}")
    public void deleteTutor(@PathVariable Long id) {
        tutorService.deleteTutor(id);
    }
}
