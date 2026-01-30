package com.charles.springbootmall.service;

//import com.charles.springbootmall.dto.ProductQueryParams;
import com.charles.springbootmall.dto.ProductRequest;

import com.charles.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

//    Integer countProduct(ProductQueryParams productQueryParams);
//
//    List<Product> getProducts(ProductQueryParams productQueryParams);
//
//    Product getProductById(Integer productId);
//

//
//    void updateProduct(Integer productId, ProductRequest productRequest);
//
//    void deleteProductById(Integer productId);
}
