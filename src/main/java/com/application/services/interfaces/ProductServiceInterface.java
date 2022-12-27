package com.application.services.interfaces;

import com.application.entities.Product;

import java.util.List;

public interface ProductServiceInterface {

    Product addProduct(Product product);
    Product getProductById(Integer productId);
    List<Product> getProducts();

}
