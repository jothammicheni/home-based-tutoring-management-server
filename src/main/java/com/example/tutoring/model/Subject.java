package com.example.tutoring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "subjects")
public class Subject {
    @Id
    @Column(name = "subject_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subjectId;

    @Column(name = "subject_name")
    private String subjectName;

    @Column(name = "category")
    private String category;

    @Column(name = "description")
    private String description;
}
