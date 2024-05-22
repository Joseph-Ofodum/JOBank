package com.example.jobank.models;

import com.example.jobank.enums.TransactionIndicator;
import com.example.jobank.enums.TransactionStatus;
import com.example.jobank.enums.TransactionType;
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


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "transactions_tbl")
public class Transactions extends Base{
    private String transactionId;
    private LocalDate transactionDate;
    private String senderId;
    @Enumerated(EnumType.STRING)
    private TransactionIndicator transactionIndicator;
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;
    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus;
    private BigDecimal transactionAmount;
    private String description;
    private String senderAccountNumber;
    private String beneficiaryPhoneNumber;
    private String beneficiaryName;
    private String beneficiaryAccountNumber;

}
