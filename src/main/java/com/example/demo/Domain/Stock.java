package com.example.demo.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
public class Stock {
    @Id
    private String id;
    private String producto_id;
    private String ubicacion_pasillo_id;
    private String departamento_id;
}
