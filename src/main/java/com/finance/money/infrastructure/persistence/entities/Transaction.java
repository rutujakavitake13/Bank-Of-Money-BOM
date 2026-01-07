package com.finance.money.infrastructure.persistence.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CurrentTimestamp;
import org.hibernate.annotations.SourceType;

import java.util.Date;

@Entity
@Table(name = "transactions")
@Data
public class Transaction {

    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "transaction_seq_id", sequenceName = "transaction_id", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "transaction_seq_id")
    private Integer Id;

    @Column(name = "AMOUNT", nullable = false, updatable = false)
    private String amount;

    @Column(name = "TRANSFER_TYPE", nullable = false, updatable = false)
    private String transferType;

    @Column(name = "CUSTOMER_ID")
    @ManyToOne
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;

    @Column(name = "ACCOUNT_ID")
    @ManyToOne
    @JoinColumn(name = "accountId", nullable = false)
    private Account account;

    @CurrentTimestamp(source = SourceType.VM)
    @Column(name = "TIMESTAMP", insertable = false, nullable = false, updatable = false)
    private Date timestamp;

}
