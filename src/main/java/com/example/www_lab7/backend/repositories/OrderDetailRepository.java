package com.example.www_lab7.backend.repositories;

import com.example.www_lab7.backend.models.OrderDetail;
import com.example.www_lab7.backend.pks.OrderDetailPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailPK> {
}