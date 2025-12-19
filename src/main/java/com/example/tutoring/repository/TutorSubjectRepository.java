package com.example.tutoring.repository;

import com.example.tutoring.model.TutorSubject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorSubjectRepository extends JpaRepository<TutorSubject, Long> {
}
