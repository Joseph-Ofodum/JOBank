package com.example.jobank.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="airtime_data_tbl")
public class AirtimeData extends Base{
    private String AirtimeDataId;
    private String provider;
    private String service;
    private String phoneNumber;
    private BigDecimal amount;
    private BigDecimal vat;
    private BigDecimal charges;
    private String userId;
}
