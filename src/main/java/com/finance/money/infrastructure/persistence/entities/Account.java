package com.finance.money.infrastructure.persistence.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Data
@Table(name = "accounts")
public class Account {

    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "account_seq_id", sequenceName = "account_id", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "account_seq_id")
    private Integer Id;

    @Column(name = "ACCOUNT_NUMBER", nullable = false, updatable = false)
    private String accountNumber;

    @Column(name = "BALANCE", nullable = false)
    private Double accountBalance;

    @Column(name = "CUSTOMER_ID")
    @ManyToOne
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;

    @CreationTimestamp
    @Column(name = "CREATED_ON", insertable = false, nullable = false, updatable = false)
    private Date createdOn;

    @UpdateTimestamp
    @Column(name = "UPDATED_ON")
    private Date updatedOn;
}
