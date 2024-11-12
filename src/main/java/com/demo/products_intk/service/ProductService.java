package com.demo.products_intk.service;

import com.demo.products_intk.document.ProductDocument;
import com.demo.products_intk.model.dto.ProductDto;
import com.demo.products_intk.repository.ProductRepository;
import com.stater.intk.model.exception.BusinessException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {
    private final ProductRepository productRepository;

    @Override
    public Mono<ProductDto> findById(String id) {
        return this.productRepository
                .findById(id)
                .switchIfEmpty(Mono.error(new BusinessException("Producto no encontrado.")))
                .map(ProductDocument::toDto);
    }
}
