package com.application.controllers.api;

import com.application.entities.Product;
import com.application.services.interfaces.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductServiceInterface productServiceBean;

    @Autowired
    public ProductController(ProductServiceInterface productServiceBean) { this.productServiceBean = productServiceBean; }

    @GetMapping
    public List<Product> getProducts(){
        return productServiceBean.getProducts();
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){return  productServiceBean.addProduct(product); }


}
