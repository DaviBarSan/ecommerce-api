package br.com.ecommerceapi.checkoutapi.service;

import br.com.ecommerceapi.checkoutapi.controller.checkout.CheckoutRequest;
import br.com.ecommerceapi.checkoutapi.entity.CheckoutEntity;
import br.com.ecommerceapi.checkoutapi.repository.CheckoutRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private final CheckoutRepository checkoutRepository;

    public CheckoutServiceImpl(CheckoutRepository checkoutRepository) {
        this.checkoutRepository = checkoutRepository;
    }


    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        return Optional.empty();
    }
}
