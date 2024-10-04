package com.example.jobank.models;

import com.example.jobank.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "transfer_tbl")
public class Transfer extends Base{
    private String sender;
    private String receiver;
    private String recipientAccount;
    private String bankName;
    private BigDecimal amount;
    private BigDecimal vat;
    private BigDecimal charges;
    private String transferId;
    @Enumerated(EnumType.STRING)
    private Status transferStatus;
    private LocalDateTime transferDateTime;
}
