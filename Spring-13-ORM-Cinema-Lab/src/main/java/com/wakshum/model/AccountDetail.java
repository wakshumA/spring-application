package com.wakshum.model;

import com.wakshum.enums.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "AccountDetails")
public class AccountDetail extends BaseEntity{

    private String address;
    private Integer age;
    private String city;
    private String country;
    private String name;
    private String postalCode;
    private String state;

    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;

    @OneToOne(mappedBy = "accountDetail")
    private UserAccount userAccount;

}
