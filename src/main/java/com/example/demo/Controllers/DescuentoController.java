package com.example.demo.Controllers;

import com.example.demo.Domain.Descuento;
import com.example.demo.Responses.Response;
import com.example.demo.Service.DescuentoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/descuentos")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class DescuentoController {
    @Autowired
    private DescuentoService service;

    @GetMapping
    public List<Descuento> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Response getDescuento(String id){
        return service.getDescuento(id);
    }

    @PostMapping
    public Descuento addDescuento(Descuento descuento){
        return service.addDescuento(descuento);
    }

    @PutMapping("/{id}")
    public Descuento updateDescuento(@PathVariable String id, @RequestBody Descuento descuento){
        descuento.setId(id);
        return service.updateDescuento(descuento);
    }

    @DeleteMapping("/{id}")
    public String deleteDescuento(@PathVariable String id){
        return service.deleteDescuento(id);
    }
}
