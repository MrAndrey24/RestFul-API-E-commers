package com.example.demo.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
public class Empleado {
    @Id
    private String id;
    private String nombre;
    private String apellidos;
    private String direccion;
}
