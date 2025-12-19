package com.example.tutoring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "schedules")
public class Schedule {
    @Id
    @Column(name = "schedule_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduleId;

    @Column(name = "tutor_id")
    private Long tutorId;

    @Column(name = "day_of_week")
    private String dayOfWeek;

    @Column(name = "time_slot")
    private String timeSlot;
}
