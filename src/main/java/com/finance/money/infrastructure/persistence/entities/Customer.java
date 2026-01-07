package com.finance.money.infrastructure.persistence.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Data
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "customer_seq_id", sequenceName = "customer_id", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "customer_seq_id")
    private Integer Id;

    @Column(name = "NAME", nullable = false, updatable = false)
    private String customerName;

    @Column(name = "PHONE_NUMBER", nullable = false)
    private String phoneNumber;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "CUSTOMER_ID", nullable = false, updatable = false)
    private String customerId;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @CreationTimestamp
    @Column(name = "CREATED_ON", insertable = false, nullable = false, updatable = false)
    private Date createdOn;

    @UpdateTimestamp
    @Column(name = "UPDATED_ON")
    private Date updatedOn;
}
