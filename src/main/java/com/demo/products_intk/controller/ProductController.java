package com.demo.products_intk.controller;

import com.demo.products_intk.model.dto.ProductDto;
import com.demo.products_intk.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products/")
public class ProductController {
    private final IProductService productService;

    @GetMapping("find-by-id")
    public ResponseEntity<Mono<ProductDto>> findById(@RequestParam String id) {
        return ok(this.productService.findById(id));
    }
}
