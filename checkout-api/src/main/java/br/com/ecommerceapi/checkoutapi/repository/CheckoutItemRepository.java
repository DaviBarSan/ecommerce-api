package br.com.ecommerceapi.checkoutapi.repository;

import br.com.ecommerceapi.checkoutapi.entity.CheckoutItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutItemRepository extends JpaRepository< CheckoutItemEntity,Long> {
}
