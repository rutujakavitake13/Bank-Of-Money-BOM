package com.finance.money.infrastructure.persistence.repository;

import com.finance.money.infrastructure.persistence.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerController extends JpaRepository<Customer, Integer> {
}
