package com.example.tutoring.model;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @Column(name = "course_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "description")
    private String description;

    @Column(name = "course_level")   // 🔥 changed
    private String level;
}
