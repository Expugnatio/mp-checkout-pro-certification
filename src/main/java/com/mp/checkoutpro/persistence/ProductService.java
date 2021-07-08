package com.mp.checkoutpro.persistence;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private static final List<ProductEntity> productList = new ArrayList<ProductEntity>(){
        {
            add(new ProductEntity("1","Samsung",8000,"Dispositivo móvil de Tienda e-commerce"));
            add(new ProductEntity("2","HTC",5000,"Dispositivo móvil de Tienda e-commerce"));
            add(new ProductEntity("3","Apple",9999,"Dispositivo móvil de Tienda e-commerce"));
            add(new ProductEntity("4","Motorola",3000,"Dispositivo móvil de Tienda e-commerce"));
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
