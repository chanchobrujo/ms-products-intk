package com.demo.products_intk.service;

import com.demo.products_intk.model.dto.ProductDto;
import reactor.core.publisher.Mono;

public interface IProductService {
    Mono<ProductDto> findById(String id);

}
