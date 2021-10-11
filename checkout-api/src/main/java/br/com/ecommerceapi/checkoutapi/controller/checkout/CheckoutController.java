package br.com.ecommerceapi.checkoutapi.controller.checkout;

import br.com.ecommerceapi.checkoutapi.service.CheckoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutController {

    //Once the interface is implemented by CheckoutServicesImpl, Spring wired this functionalities.
    //So work with interface wired to the bean 'service implementation' instead with the service
    // class is a good pratice;
    private final CheckoutService checkoutService;

    @PostMapping("/")
    public ResponseEntity<Void> create(CheckoutRequest checkoutRequest){
        checkoutService.create(checkoutRequest);
        return ResponseEntity.ok().build();
    }
}
