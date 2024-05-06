package com.example.employeecruddemo.Service;

import java.util.List;

import com.example.employeecruddemo.model.Product;

public interface ProductService {
public Product addProduct(Product product);
public List<Product> getAllProducts();
public Product getProductById(int pid);
public void  deleteById(int pid);
public List<Product> searchProduct(String text);
}
