package com.mp.checkoutpro.exceptions;

import com.mercadopago.exceptions.MPConfException;
import com.mercadopago.exceptions.MPException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CheckOutProControllerAdvice {

    @ExceptionHandler(MPConfException.class)
    public String mpConfExceptionHandler(MPConfException e){
        e.printStackTrace();
        return e.toString();
    }

    @ExceptionHandler(MPException.class)
    public String mpExceptionHandler(MPConfException e){
        e.printStackTrace();
        return e.toString();
    }

}
