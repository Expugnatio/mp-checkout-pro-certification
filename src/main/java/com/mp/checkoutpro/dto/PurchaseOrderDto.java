package com.mp.checkoutpro.dto;

import com.mp.checkoutpro.persistence.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrderDto {
    private ProductEntity product;
    private int quantity;
}
