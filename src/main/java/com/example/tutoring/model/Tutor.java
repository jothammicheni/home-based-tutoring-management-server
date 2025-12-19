package com.example.tutoring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tutors")
public class Tutor {
    @Id
    @Column(name = "tutor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tutorId;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "specialization")
    private String specialization;
}
