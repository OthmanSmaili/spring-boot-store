package com.othmansmaili.store.repositories;

import com.othmansmaili.store.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}