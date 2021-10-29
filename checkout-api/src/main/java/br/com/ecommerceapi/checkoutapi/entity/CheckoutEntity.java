package br.com.ecommerceapi.checkoutapi.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String code;

    @Column
    private String status;
}
