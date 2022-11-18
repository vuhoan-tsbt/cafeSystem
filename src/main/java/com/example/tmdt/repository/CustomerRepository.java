package com.example.tmdt.repository;

import com.example.tmdt.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Integer, Customer> {
}
