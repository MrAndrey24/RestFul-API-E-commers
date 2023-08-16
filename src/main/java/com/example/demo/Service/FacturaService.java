package com.example.demo.Service;

import com.example.demo.Domain.Factura;
import com.example.demo.Repositories.FacturaRepository;
import com.example.demo.Responses.Factory.FacturaResponseFactory;
import com.example.demo.Responses.Factory.ResponseFactory;
import com.example.demo.Responses.Factory.StockResponseFactory;
import com.example.demo.Responses.Response;
import com.example.demo.Responses.ResponseType;
import com.example.demo.Utils.Validaciones;
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

    public Response getFactura(String id) {

        Factura factura = facturaRepository.findById(id).orElse(null);
        if (factura == null) {
            FacturaResponseFactory facturaResponseFactory = new FacturaResponseFactory();

            return
                    facturaResponseFactory.getResponse(ResponseType.ERROR, "No se encontró la factura", null);
        }

        else {
            ResponseFactory facturaResponseFactory = new StockResponseFactory();

            return facturaResponseFactory.getResponse(ResponseType.OK, "Stock encontrado", factura);
        }

    }

    public Factura addFactura(Factura factura) {

        if (!Validaciones.getInstance().validarMoneda(factura.getMoneda())) {
            throw new Error("Moneda inválida");
        }
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
