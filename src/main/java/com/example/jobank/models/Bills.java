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
@Table(name="bill_tbl")
public class Bills extends Base{
    private String billId;
    private String recipientAccount;
    private String service;
    private BigDecimal amount;
    private BigDecimal vat;
    private BigDecimal charges;
    private String provider;
    private String userId;


}
