package com.example.www_lab7.fontend.dto;

import com.example.www_lab7.backend.models.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class CartItem implements Serializable {
    private Product product;
    private int amount;
}

