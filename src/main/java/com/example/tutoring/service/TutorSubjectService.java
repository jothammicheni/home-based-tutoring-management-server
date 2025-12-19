package com.example.tutoring.service;

import com.example.tutoring.model.TutorSubject;
import com.example.tutoring.repository.TutorSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TutorSubjectService {
    @Autowired
    private TutorSubjectRepository tutorSubjectRepository;

    public List<TutorSubject> getAllTutorSubjects() {
        return tutorSubjectRepository.findAll();
    }

    public TutorSubject saveTutorSubject(TutorSubject tutorSubject) {
        return tutorSubjectRepository.save(tutorSubject);
    }

    public void deleteTutorSubject(Long id) {
        tutorSubjectRepository.deleteById(id);
    }
}
