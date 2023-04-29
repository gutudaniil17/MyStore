package com.example.mystore.repository;

import com.example.mystore.model.OrderProduct;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct,Long> {
}
