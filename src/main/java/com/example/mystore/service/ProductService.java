package com.example.mystore.service;

import com.example.mystore.model.Product;

public interface ProductService {
    Iterable<Product> getAllProducts();
    Product getProduct(long id);
    Product save(Product product);
}
