package com.mp.checkoutpro;

import com.mercadopago.MercadoPago;
import com.mercadopago.exceptions.MPConfException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CheckoutProApplication {

	private static final String CO_PRO_ACCESS_TOKEN = "APP_USR-2572771298846850-120119-a50dbddca35ac9b7e15118d47b111b5a-681067803";
	private static final String CO_PRO_INTEGRATOR_ID = "dev_24c65fb163bf11ea96500242ac130004";


	public static void main(String[] args) throws MPConfException {
		SpringApplication.run(CheckoutProApplication.class, args);
		MercadoPago.SDK.setAccessToken(CO_PRO_ACCESS_TOKEN);
		MercadoPago.SDK.setIntegratorId(CO_PRO_INTEGRATOR_ID);
	}

}
