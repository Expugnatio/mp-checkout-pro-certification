package com.mp.checkoutpro.persistence;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private static final List<ProductEntity> productList = new ArrayList<ProductEntity>(){
        {
            add(new ProductEntity("1234","Samsung",80000,"Dispositivo móvil de Tienda e-commerce"));
            add(new ProductEntity("1234","HTC",50000,"Dispositivo móvil de Tienda e-commerce"));
            add(new ProductEntity("1234","Apple",99990,"Dispositivo móvil de Tienda e-commerce"));
            add(new ProductEntity("1234","Motorola",30000,"Dispositivo móvil de Tienda e-commerce"));
        }
    };

    public ProductEntity findProductById(String id){
        for (ProductEntity product : this.productList) {
            if (product.getId().equalsIgnoreCase(id)){
                return product;
            }
        }
        return null;
    }

    public List<ProductEntity> getAllProducts(){
        return productList;
    }
}
