package br.com.ecommerceapi.checkoutapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "shipping_entity")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
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