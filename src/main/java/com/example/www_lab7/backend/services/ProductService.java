package com.example.www_lab7.backend.services;

import com.example.www_lab7.backend.models.Product;
import com.example.www_lab7.backend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Page<Product> findPaginated(int pageNo, int pageSize, String sortBy , String sortDirection){
    Sort sort = Sort.by(Sort.Direction.fromString(sortDirection),sortBy);
    Pageable pageable = PageRequest.of(pageNo, pageSize,sort);
    return productRepository.findAll(pageable) ;
    }
}
