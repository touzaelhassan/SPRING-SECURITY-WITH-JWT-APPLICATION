package com.application.services.classes;

import com.application.entities.Product;
import com.application.repositories.ProductRepository;
import com.application.services.interfaces.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productServiceBean")
public class ProductServiceClass implements ProductServiceInterface {

    private ProductRepository productRepositoryBean;

    @Autowired
    public ProductServiceClass(ProductRepository productRepositoryBean) { this.productRepositoryBean = productRepositoryBean; }

    @Override
    public Product addProduct(Product product) { return  productRepositoryBean.save(product); }

    @Override
    public Product getProductById(Integer productId) { return null; }

    @Override
    public List<Product> getProducts() { return productRepositoryBean.findAll(); }

}
