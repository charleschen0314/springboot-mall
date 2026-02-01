package com.charles.springbootmall.dao;

import com.charles.springbootmall.dto.ProductQueryParams;
import com.charles.springbootmall.dto.ProductRequest;
import com.charles.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

    List<Product> getProducts(ProductQueryParams productQueryParams);

//    Integer countProduct(ProductQueryParams productQueryParams);
//
//    void updateStock(Integer productId, Integer stock);
//

}
