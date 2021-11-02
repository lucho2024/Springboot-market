package com.luis.market.web.controller;

import com.luis.market.domain.Product;
import com.luis.market.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable("id") Long productId){
        return productService.getProduct(productId);
    }
    @GetMapping("/category/{categoryId}")
    public Optional<List<Product>>getByCategory(@PathVariable("categoryId") Long categoryId){
        return productService.getByCategory(categoryId);
    }
    @PostMapping("/")
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id")Long productId){
        return productService.delete(productId);
    }

}