package br.com.ecommerceapi.checkoutapi.config;

import br.com.ecommerceapi.checkoutapi.event.CheckoutCreatedEvent;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.StreamMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.converter.MessageConverter;

import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.function.Supplier;

@SpringBootApplication
public class CheckoutProducerFactory {

    @Bean
    public Supplier<CheckoutCreatedEvent> checkoutCreated(){

        return () -> CheckoutCreatedEvent.newBuilder()
                .setCheckoutCode(UUID.randomUUID().toString())
                .setStatus("Accepted")
                .build();
    }

}
