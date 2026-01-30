package com.charles.springbootmall.dao;

//import com.charles.springbootmall.dto.ProductQueryParams;
import com.charles.springbootmall.dto.ProductRequest;
import com.charles.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

        Product getProductById(Integer productId);

        Integer createProduct(ProductRequest productRequest);

//    Integer countProduct(ProductQueryParams productQueryParams);
//
//    List<Product> getProducts(ProductQueryParams productQueryParams);
//
//

//
//    void updateProduct(Integer productId, ProductRequest productRequest);
//
//    void updateStock(Integer productId, Integer stock);
//
//    void deleteProductById(Integer productId);
}
