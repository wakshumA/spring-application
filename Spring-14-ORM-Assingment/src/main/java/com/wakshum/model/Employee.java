package com.wakshum.model;

import com.wakshum.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Data
@Table(name = "employees")
public class Employee {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime hireDate;
    private String department;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private BigDecimal salary;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private Region region;


}