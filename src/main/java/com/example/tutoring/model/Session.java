package com.example.tutoring.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "sessions")
public class Session {
    @Id
    @Column(name = "session_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sessionId;

    @Column(name = "enrollment_id")
    private Long enrollmentId;

    @Column(name = "tutor_id")
    private Long tutorId;

    @Column(name = "session_date")
    private Date sessionDate;
}
