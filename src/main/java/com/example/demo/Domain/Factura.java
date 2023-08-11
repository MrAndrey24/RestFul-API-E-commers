package com.example.demo.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
public class Factura {
    @Id
    private String id;
    private String moneda;
    private String metodo_pago_id;
    private String cliente_id;

}
