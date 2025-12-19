package com.example.tutoring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "attendance")
public class Attendance {
    @Id
    @Column(name = "attendance_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attendanceId;

    @Column(name = "session_id")
    private Long sessionId;

    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "status")
    private String status;
}
