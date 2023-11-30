package com.example.www_lab7.backend.repositories;

import com.example.www_lab7.backend.models.ProductPrice;
import com.example.www_lab7.backend.pks.ProductPricePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, ProductPricePK> {
}