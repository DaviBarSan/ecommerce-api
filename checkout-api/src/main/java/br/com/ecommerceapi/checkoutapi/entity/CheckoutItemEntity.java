package br.com.ecommerceapi.checkoutapi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "checkout_item_entity")
@Setter
@Getter
@Entity
public class CheckoutItemEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String product;

    @ManyToOne
    private CheckoutEntity checkoutEntity;
}