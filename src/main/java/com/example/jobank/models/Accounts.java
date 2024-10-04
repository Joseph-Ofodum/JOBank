package com.example.jobank.models;

import com.example.jobank.enums.AccountType;
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
@Table(name = "accounts_tbl")
public class Accounts extends Base{
    private String userId;
    private AccountType typeOfAccount;
    private String accountNumber;
    private BigDecimal mainBalance = BigDecimal.ZERO;
    private BigDecimal bookBalance = BigDecimal.ZERO;
    private String currency;

}
