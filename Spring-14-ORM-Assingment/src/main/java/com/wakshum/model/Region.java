package com.wakshum.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "regions")
public class Region {

    @Id
    private Long id;
    private String region;
    private String country;

    @OneToOne(mappedBy = "region")
    private Employee employee;

}
