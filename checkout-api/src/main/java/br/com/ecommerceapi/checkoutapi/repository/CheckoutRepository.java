package br.com.ecommerceapi.checkoutapi.repository;

import br.com.ecommerceapi.checkoutapi.entity.CheckoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutRepository extends JpaRepository<CheckoutEntity, Long> {
}
