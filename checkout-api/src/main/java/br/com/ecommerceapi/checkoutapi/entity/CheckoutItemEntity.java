package br.com.ecommerceapi.checkoutapi.entity;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Table(name = "checkout_item_entity")
@Setter
@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutItemEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String product;

    @ManyToOne(cascade = CascadeType.ALL)
    private CheckoutEntity checkoutEntity;
}