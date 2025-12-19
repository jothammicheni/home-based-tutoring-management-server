package com.example.tutoring.controller;

import com.example.tutoring.model.TutorSubject;
import com.example.tutoring.service.TutorSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tutor-subjects")
@CrossOrigin(origins = "http://localhost:5173")
public class TutorSubjectController {
    @Autowired
    private TutorSubjectService tutorSubjectService;

    @GetMapping
    public List<TutorSubject> getAllTutorSubjects() {
        return tutorSubjectService.getAllTutorSubjects();
    }

    @PostMapping
    public TutorSubject saveTutorSubject(@RequestBody TutorSubject tutorSubject) {
        return tutorSubjectService.saveTutorSubject(tutorSubject);
    }

    @DeleteMapping("/{id}")
    public void deleteTutorSubject(@PathVariable Long id) {
        tutorSubjectService.deleteTutorSubject(id);
    }
}
