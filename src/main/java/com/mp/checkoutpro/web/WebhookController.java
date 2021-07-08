package com.mp.checkoutpro.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/webhook")
@RequiredArgsConstructor
public class WebhookController {

    @PostMapping
    public String viewProducts(@RequestParam("payment_id") String paymentId, @RequestParam("status") String status,
            @RequestParam("external_reference") String externalReference, @RequestParam("merchant_order_id") String merchantOrderId) {
        return "main";
    }
}
