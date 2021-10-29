package br.com.ecommerceapi.checkoutapi.entity;

import javax.persistence.*;

@Table(name = "shipping_entity")
@Entity
public class ShippingEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String address;

    @Column
    private String complement;

    @Column
    private String country;

    @Column
    private String state;

    @Column
    private String cep;

    @OneToOne(mappedBy = "shipping")
    private CheckoutEntity checkout;
}