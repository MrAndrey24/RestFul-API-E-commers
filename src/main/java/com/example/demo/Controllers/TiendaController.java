package com.example.demo.Controllers;

import com.example.demo.Domain.Tienda;
import com.example.demo.Service.TiendaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/tiendas")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class TiendaController {
    @Autowired
    private TiendaService service;

    @GetMapping
    public List<Tienda> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Tienda getTienda(String id){
        return service.getTienda(id);
    }

    @PostMapping
    public Tienda addTienda(@RequestBody Tienda tienda){
        return service.addTienda(tienda);
    }

    @PutMapping("/{id}")
    public Tienda updateTienda(@PathVariable String id, @RequestBody Tienda tienda){
        tienda.setId(id);
        return service.updateTienda(tienda);
    }

    @DeleteMapping("/{id}")
    public String deleteTienda(@PathVariable String id){
        return service.deleteTienda(id);
    }
}
