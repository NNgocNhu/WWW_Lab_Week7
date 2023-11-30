package com.example.www_lab7.backend.repositories;

import com.example.www_lab7.backend.models.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {
}