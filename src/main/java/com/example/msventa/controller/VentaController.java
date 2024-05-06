package com.example.msventa.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/venta")
public class VentaController {

    @GetMapping("/init/{id}")
    public String message(@PathVariable (name = "id") String id){
        return "bienvenido al servicio ID : " + id ;
    }
}
