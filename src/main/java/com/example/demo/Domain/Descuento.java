package com.example.demo.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
public class Descuento {
    @Id
    private String id;
    private Double porcentaje;
    private String fecha_fin;
    private String fecha_inicio;
    private String producto_id;
}
