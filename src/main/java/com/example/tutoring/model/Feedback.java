package com.example.tutoring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "feedback")
public class Feedback {
    @Id
    @Column(name = "feedback_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackId;

    @Column(name = "tutor_id")
    private Long tutorId;

    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "rating")
    private Integer rating;
}
