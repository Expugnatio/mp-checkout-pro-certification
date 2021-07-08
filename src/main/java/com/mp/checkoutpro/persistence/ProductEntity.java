package com.mp.checkoutpro.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    private String id;
    private String name;
    private float price;
    private String description;
}
