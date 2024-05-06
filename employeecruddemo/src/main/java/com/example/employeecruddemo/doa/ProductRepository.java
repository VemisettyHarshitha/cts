package com.example.employeecruddemo.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeecruddemo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{
}
