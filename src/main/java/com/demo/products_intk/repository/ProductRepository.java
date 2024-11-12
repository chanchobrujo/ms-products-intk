package com.demo.products_intk.repository;

import com.demo.products_intk.document.ProductDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<ProductDocument, String> {
}
