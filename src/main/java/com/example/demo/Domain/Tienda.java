package com.example.demo.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
public class Tienda {
    @Id
    private String id;
    private String ubicacion;
    private String supervisor_id;
}
