package com.example.msventa.controller;

import com.example.msventa.data.Venta;
import com.example.msventa.service.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.function.Supplier;

@RestController
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    SendMessage sendMessage;




    @GetMapping("/init/{id}")
    public String message(@PathVariable (name = "id") String id){

        sendMessage.supply();

        return "enviando el mensaje : " + id ;
    }
}
