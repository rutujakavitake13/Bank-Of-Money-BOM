package com.finance.money.infrastructure.persistence.repository;

import com.finance.money.infrastructure.persistence.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
