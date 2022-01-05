package com.Oydin.productservice.Service;


import com.Oydin.productservice.Model.Product;
import com.Oydin.productservice.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product create (Product product){
        Product newProduct = productRepository.save(product);
        return newProduct;
    }

    public  Product getById (String productId){
        return productRepository.findById(productId).get();
    }
    public List<Product> getAll(){
        List<Product> productList = productRepository.findAll();
        return productList;
    }
}
