package br.com.ecommerceapi.checkoutapi.config;

import br.com.ecommerceapi.checkoutapi.event.CheckoutCreatedEvent;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

@SpringBootApplication
@Getter
public class CheckoutProducerFactory {


    private final BlockingQueue<CheckoutCreatedEvent> checkoutCreatedEventBlockingQueue = new LinkedBlockingQueue<>();

    @Bean
    public Supplier<CheckoutCreatedEvent> checkoutCreated(){
        return () -> checkoutCreatedEventBlockingQueue.poll();
    }

}
