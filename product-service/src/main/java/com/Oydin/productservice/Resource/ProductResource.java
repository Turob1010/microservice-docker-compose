package com.Oydin.productservice.Resource;

import com.Oydin.productservice.Model.Product;
import com.Oydin.productservice.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResource {

    @Autowired
    private ProductService productService;
    @PostMapping("/save")
    public Product save (@RequestBody Product product){
        return productService.create(product);
    }
    @GetMapping("/{productId}")
    public Product getById(@PathVariable String productId){
        return productService.getById(productId);
    }
    @GetMapping("/all")
    public List<Product> getAllProducts(){
        List<Product> productList = productService.getAll();
        return productList;

    }


}
