package com.mp.checkoutpro.service;

import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.Preference;
import com.mercadopago.resources.datastructures.preference.*;
import com.mp.checkoutpro.dto.PurchaseOrderDto;
import com.mp.checkoutpro.persistence.ProductEntity;
import org.springframework.stereotype.Service;

@Service
public class MercadoPagoService {

    private static final String appBaseUrl = "https://mp-checkout-pro-certification.herokuapp.com/checkout-pro";
    private static final String imageUrl = "https://vivirenelpoblado.com/wp-content/uploads/Celulares--696x464.jpg";
    private static final String email = "chris.hrdez@gmail.com";

    public Preference createProductPreference(PurchaseOrderDto order) throws MPException {
        Preference preference = new Preference();

        preference.setExternalReference(email);

        preference.appendItem(getItem(order.getProduct())
                .setQuantity(order.getQuantity()));

        preference.setPayer(getPayer());

        preference.setPaymentMethods(getPaymentMethods());

        preference.setBackUrls(getBackUrls());
        preference.setAutoReturn(Preference.AutoReturn.approved);

        preference.setNotificationUrl(appBaseUrl + "/webhook");

        return preference.save();
    }

    private PaymentMethods getPaymentMethods() {
        PaymentMethods paymentMethods = new PaymentMethods();
        paymentMethods.appendExcludedPaymentMethod(new ExcludedPaymentMethod("amex"));
        paymentMethods.appendExcludedPaymentTypes(new ExcludedPaymentType("atm"));
        paymentMethods.setInstallments(6);
        return paymentMethods;
    }

    private Item getItem(ProductEntity product){
        Item item = new Item();
        item.setId(product.getId())
            .setTitle(product.getName())
            .setUnitPrice(product.getPrice())
            .setDescription(product.getDescription())
            .setCategoryId("phones")
            .setPictureUrl(imageUrl);
        return item;
    }

    private Payer getPayer(){

        Payer payer = new Payer();
        payer.setName("Lalo");
        payer.setSurname("Landa");

        payer.setEmail("test_user_83958037@testuser.com");

        Address address = new Address();
        address.setStreetName("Insurgentes Sur");
        address.setStreetNumber(1602);
        address.setZipCode("03940");

        payer.setAddress(address);

        Phone phone = new Phone();
        phone.setAreaCode("52");
        phone.setNumber("5549737300");

        payer.setPhone(phone);

        Identification identification = new Identification();
        identification.Identification("CC","681094118");

        payer.setIdentification(identification);

        return payer;
    }

    private BackUrls getBackUrls(){
        BackUrls backUrls = new BackUrls();
        backUrls.setSuccess(appBaseUrl + "/comeback");
        backUrls.setPending(appBaseUrl + "/comeback");
        backUrls.setFailure(appBaseUrl + "/comeback");

        return backUrls;
    }

}
