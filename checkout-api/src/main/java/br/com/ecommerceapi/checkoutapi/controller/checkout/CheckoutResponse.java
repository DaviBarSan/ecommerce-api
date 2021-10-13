package br.com.ecommerceapi.checkoutapi.controller.checkout;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//Works as a DTO, to do not expose entity data and just return the code attribute as response.
public class CheckoutResponse {
    private String code;
}
