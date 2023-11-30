package com.example.www_lab7.fontend.controller;
import com.example.www_lab7.backend.models.Product;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/cart")
public class ShoppingCartController {
    @GetMapping("/view-cart")
    public String view_cart(Model model, HttpSession session) {
        return "client/checkout";
    }


}
