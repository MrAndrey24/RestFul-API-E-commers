package com.example.demo.Controllers;

import com.example.demo.Domain.Proveedor;
import com.example.demo.Responses.Response;
import com.example.demo.Service.ProveedorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/proveedores")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class ProveedorController {
    @Autowired
    private ProveedorService service;

    @GetMapping
    public List<Proveedor> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Response getProveedor(String id){
        return service.getProveedor(id);
    }

    @PostMapping
    public Proveedor addProveedor(Proveedor proveedor){
        return service.addProveedor(proveedor);
    }

    @PutMapping("/{id}")
    public Proveedor updateProveedor(@PathVariable String id, @RequestBody Proveedor proveedor){
        proveedor.setId(id);
        return service.updateProveedor(proveedor);
    }

    @DeleteMapping("/{id}")
    public String deleteProveedor(@PathVariable String id){
        return service.deleteProveedor(id);
    }
}
