package com.example.demo.Controllers;

import com.example.demo.Domain.Producto;
import com.example.demo.Responses.Response;
import com.example.demo.Service.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/productos")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class ProductoController {
    @Autowired
    ProductoService service;

    @GetMapping
    public List<Producto> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Response getProducto(@PathVariable String id){
        return service.getProducto(id);
    }

    @PostMapping
    public Producto addProducto(@RequestBody Producto producto){
        return service.addProducto(producto);
    }

    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable String id, @RequestBody Producto producto){
        producto.setId(id);
        return service.updateProducto(producto);
    }

    @DeleteMapping("/{id}")
    public String deleteProducto(@PathVariable String id){
        return service.deleteProducto(id);
    }
}
