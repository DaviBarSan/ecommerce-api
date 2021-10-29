package br.com.ecommerceapi.checkoutapi.repository;

import br.com.ecommerceapi.checkoutapi.entity.CheckoutEntity;
import br.com.ecommerceapi.checkoutapi.entity.ShippingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingRepository extends JpaRepository<ShippingEntity, Long> {
}
