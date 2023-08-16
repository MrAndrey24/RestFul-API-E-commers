package com.example.demo.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
public class Producto {
    @Id
    private String id;
    private String nombre;
    private int precio;
    private String expiracion;
    private int sku;
    private String proveedor_id;
    private String departamento_id;
    private String stock_id;
    private String factura_id;
}
