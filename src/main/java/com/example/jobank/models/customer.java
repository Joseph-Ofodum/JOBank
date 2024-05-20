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

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "customer_tbl")
public class customer extends Base{
    private String userId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String province;
    private String state;
    private String country;
    private String selfieUrl;
    private String frontOfIdUrl;
    private String backOfIdUrl;
    private Integer dateOfBirth;
    private String utilityBillUrl;
    private String email;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String nationality;
    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;
    private String bvn;
    private String nextOfKin;
    private String addressOfNextOfKin;
    private String provinceOfNextOfKin;
    private String stateOfNextOfKin;
    private String countryOfNextOfKin;
    private String emailOfNextOfKin;
    private String relationshipWithNextOfKin;
    private String phoneNumberOfNextOfKin;
    private String nationalityOfNextOfKin;
    @Enumerated(EnumType.STRING)
    private Gender genderOfNextOfKin;
    private Boolean isActive;


}
