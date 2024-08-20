package com.inatandev.dscatalog.repositories;

import com.inatandev.dscatalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
