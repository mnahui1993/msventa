package com.example.msventa.data;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Venta {

    private String id;
    private String product;
    private int amount;
}
