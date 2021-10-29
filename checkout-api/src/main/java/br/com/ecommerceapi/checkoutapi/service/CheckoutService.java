package br.com.ecommerceapi.checkoutapi.service;

import br.com.ecommerceapi.checkoutapi.controller.CheckoutRequest;
import br.com.ecommerceapi.checkoutapi.entity.CheckoutEntity;

import java.util.Optional;

public interface CheckoutService {
    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) ;
}
