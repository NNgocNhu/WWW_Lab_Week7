package com.example.www_lab7.backend.repositories;

import com.example.www_lab7.backend.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}