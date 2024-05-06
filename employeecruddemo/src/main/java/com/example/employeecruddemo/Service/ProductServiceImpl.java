package com.example.employeecruddemo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeecruddemo.doa.ProductRepository;
import com.example.employeecruddemo.model.Product;

@Service
public class ProductServiceImpl implements ProductService{
@Autowired
private ProductRepository productRepository;
@Override
public Product addProduct(Product product) {
	
	return productRepository.save(product);
}
@Override
public List<Product> getAllProducts() {
	// TODO Auto-generated method stub
	return productRepository.findAll();
}
@Override
public Product getProductById(int pid) {
	// TODO Auto-generated method stub
	return productRepository.findById(pid).get();
}
@Override
public void deleteById(int pid) {
	// TODO Auto-generated method stub
	productRepository.deleteById(pid);
}
@Override
public List<Product> searchProduct(String text) {
	// TODO Auto-generated method stub
	List<Product> products=productRepository.findAll();
	List<Product> data=new ArrayList<>();
	for(Product product:products) {
		if(product.getPname().equals(text) ||
		  String.valueOf(product.getPid()).equals(text)){
			data.add(product);
		}
	}
	return data;
}

}
