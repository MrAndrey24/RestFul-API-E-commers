package com.example.demo.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

@Getter
@Setter
@AllArgsConstructor
public class Cliente {
    @Id
    private String id;
    private String nombre;
    private String apellidos;
    private String direccion;
    private int telefono;
    @Indexed(unique = true)
    private String correo;
}
