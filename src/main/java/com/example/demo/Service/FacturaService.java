package com.example.demo.Service;

import com.example.demo.Domain.Factura;
import com.example.demo.Repositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    public List<Factura> getFacturas() {
        return facturaRepository.findAll();
    }

    public Factura getFactura(String id) {
        return facturaRepository.findById(id).orElse(null);
    }

    public Factura addFactura(Factura factura) {
        return facturaRepository.save(factura);
    }

    public Factura updateFactura(Factura factura) {
        return facturaRepository.save(factura);
    }

    public String deleteFactura(String id) {
        facturaRepository.deleteById(id);
        return "Factura eliminada con éxito";
    }
}
