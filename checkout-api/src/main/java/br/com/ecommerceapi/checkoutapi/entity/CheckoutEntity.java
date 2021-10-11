package br.com.ecommerceapi.checkoutapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.kafka.common.security.oauthbearer.OAuthBearerToken;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutEntity {
    @Id
    private Long id;

    @Column
    private String code;

}
