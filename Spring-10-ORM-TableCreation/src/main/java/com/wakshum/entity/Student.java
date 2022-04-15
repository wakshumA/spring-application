package com.wakshum.entity;

import com.wakshum.enums.Gender;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "studentFirstName")
    private String firstName;//first_name
    @Column(name = "studentLastName")
    private String lastName;
    private String email;

    @Transient   //non-consistent data, does not show in table
    private String city;
    @Column(columnDefinition = "Date")
    private LocalDateTime birthDate;
    @Column(columnDefinition = "Time")
    private LocalDateTime birthTime;
    @Column(columnDefinition = "TimeStamp")
    private LocalDateTime birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;


}
