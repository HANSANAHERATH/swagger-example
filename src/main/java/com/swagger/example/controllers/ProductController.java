package com.swagger.example.controllers;

import com.swagger.example.dto.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @GetMapping(value = "/{productId}")
    public String findByProductId(@PathVariable("productId") Long productId) {
        return productId.toString();
    }

    @GetMapping(value = "/")
    public String findAll() {
        return "return all";
    }

    @PostMapping(value = "/")
    public String createProduct(@RequestBody Product product) {
        return product.toString();
    }

    @PutMapping(value = "/{productId}")
    public String updateProduct(@RequestBody Product product, @PathVariable("productId") Long productId) {
        return product.toString();
    }

    @DeleteMapping(value = "/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId) {
        return productId.toString();
    }

    @GetMapping(value = "/find-by-name")
    public String findByNameProduct(@RequestParam(value = "name", required = false) String name) {
        return name;
    }
}
