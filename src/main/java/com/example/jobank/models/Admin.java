package com.example.jobank.models;

import com.example.jobank.enums.Gender;
import com.example.jobank.enums.MaritalStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "admin_tbl")
public class Admin extends Base{
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String decoration;
    private BigDecimal salary;
    private String province;
    private String state;
    private String country;
    private String selfieUrl;
    private LocalDate dateOfBirth;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String nationality;
    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;
    private Boolean isActive;
}
