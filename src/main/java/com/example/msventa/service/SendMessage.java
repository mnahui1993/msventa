package com.example.msventa.service;

import com.azure.spring.messaging.servicebus.support.ServiceBusMessageHeaders;
import com.example.msventa.data.Venta;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Sinks;

import java.util.UUID;
import java.util.function.Supplier;

@Component
public class SendMessage {

    private static final Logger LOGGER = LoggerFactory.getLogger(SendMessage.class);


    @Bean
    public Supplier<Mono<Message<Venta>>> supply() {
        return ()->  Mono.just(MessageBuilder.withPayload(new Venta("1","producto" + UUID.randomUUID().toString(),0))
                .build());

    }





}
