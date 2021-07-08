package com.mp.checkoutpro.web;

import com.mp.checkoutpro.dto.PurchaseOrderDto;
import com.mp.checkoutpro.persistence.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/comeback")
@RequiredArgsConstructor
public class BackPaymentController {

    @GetMapping
    public String viewProducts(@RequestParam("payment_id") String paymentId, @RequestParam("status") String status,
            @RequestParam("external_reference") String externalReference, @RequestParam("merchant_order_id") String merchantOrderId) {
        return "main";
    }
}
