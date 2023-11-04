package com.example.www_lab7.fontend.controller;

import com.example.www_lab7.backend.models.Product;
import com.example.www_lab7.backend.repositories.ProductRepository;
import com.example.www_lab7.backend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
@Controller
public class ProductController {
@Autowired
    private ProductService productService;
    @Autowired
    private ProductRepository productRepository;
     @GetMapping("/products")
    public String showCandidateListPageing(Model model,
                                           @RequestParam("page")Optional<Integer> page,
                                           @RequestParam("size")Optional<Integer> size){
         int currentPage = page.orElse(1);
         int pageSize = size.orElse(10);
         Page<Product> candidatePage = productService.findPaginated(currentPage-1,pageSize,"name","asc");
         model.addAttribute("productPage", candidatePage);
         int totalPages = candidatePage.getTotalPages();
         if(totalPages > 0){
             List<Integer> pageNumbers = IntStream.rangeClosed(1,totalPages)
                     .boxed()
                     .collect(Collectors.toList());
             model.addAttribute("pageNumbers",pageNumbers);

         }
         return "admin/product/listing";
     }
     @GetMapping("/show-add-form")
    public String add(Model model){
         Product product = new Product();
         model.addAttribute("product",product);
         return "admin/product/add-form";
     }
     @PostMapping("/products/add")
    public String addCandidate(
            @ModelAttribute("product") Product product,
            BindingResult result, Model model
     ){
         productRepository.save(product);
         return "redirect:/products";
     }
     @GetMapping("/products/delete/{id}")
    public  String addCandidate(@PathVariable("id") long id){
    Product product = productRepository.findById(id).orElse(new Product());
    productRepository.delete(product);
    return "redirect:/products";
     }
}
