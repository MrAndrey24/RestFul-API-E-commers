package com.example.demo.Controllers;

import com.example.demo.Domain.Factura;
import com.example.demo.Service.FacturaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/factura")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping
    public List<Factura> getFactura() {
        return facturaService.getFacturas();
    }

    @GetMapping("/{id}")
    public Factura getFactura(@PathVariable String id) {
        return facturaService.getFactura(id);
    }

    @PostMapping
    public Factura addFactura(@RequestBody Factura factura) {
        return facturaService.addFactura(factura);
    }

    @PutMapping("/{id}")
    public Factura updateFactura(@PathVariable String id, @RequestBody Factura factura) {
        factura.setId(id);
        return facturaService.updateFactura(factura);
    }

    @DeleteMapping("/{id}")
    public String deleteFactura(@PathVariable String id) {
        return facturaService.deleteFactura(id);
    }
}
