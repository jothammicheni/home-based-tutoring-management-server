package com.example.tutoring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tutor_subjects")
public class TutorSubject {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tutor_id")
    private Long tutorId;

    @Column(name = "subject_id")
    private Long subjectId;

    @Column(name = "experience_yrs")
    private Integer experienceYrs;
}
