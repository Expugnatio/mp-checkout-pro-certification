package com.mp.checkoutpro.web;

import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.Preference;
import com.mp.checkoutpro.dto.PurchaseOrderDto;
import com.mp.checkoutpro.persistence.ProductEntity;
import com.mp.checkoutpro.persistence.ProductService;
import com.mp.checkoutpro.service.MercadoPagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
@RequestMapping("/checkout")
@RequiredArgsConstructor
public class CheckoutController {

    private final MercadoPagoService mpService;
    private final ProductService productService;

    @PostMapping
    public String viewCheckout(@ModelAttribute PurchaseOrderDto order, Model model) throws MPException {
        findProductForOrder(order);
        Preference savedPreference = mpService.createProductPreference(order);

        model.addAttribute("preferenceId", savedPreference.getId());
        return "checkout";
    }

    private void findProductForOrder(PurchaseOrderDto order) {
        ProductEntity product = productService.findProductById(order.getProduct().getId());
        order.setProduct(product);
    }
}
