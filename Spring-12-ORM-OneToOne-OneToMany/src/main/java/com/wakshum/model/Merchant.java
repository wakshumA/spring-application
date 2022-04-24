package com.wakshum.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "merchants")
@Data
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String code;
    private BigDecimal transactionFee;
    private BigDecimal commissionFee;
    private Integer payoutDelayCount;

    @OneToMany(mappedBy = "merchant")
    private List<Payment> paymentList;


}
