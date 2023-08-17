package com.example.demo.Service;

import com.example.demo.Domain.Departamento;
import com.example.demo.Domain.Descuento;
import com.example.demo.Repositories.DescuentoRepository;
import com.example.demo.Responses.Factory.DepartamentoResponseFactory;
import com.example.demo.Responses.Factory.DescuentoResponseFactory;
import com.example.demo.Responses.Factory.ResponseFactory;
import com.example.demo.Responses.Response;
import com.example.demo.Responses.ResponseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DescuentoService {
    @Autowired
    private DescuentoRepository repo;

    public List<Descuento> getAll(){
        return repo.findAll();
    }

    public Response getDescuento(String id){
        Descuento descuento = repo.findById(id).orElse(null);
        if (descuento == null) {
            DescuentoResponseFactory descuentoResponseFactory = new DescuentoResponseFactory();

            return
                    descuentoResponseFactory.getResponse(ResponseType.ERROR, "No se encontró el cliente", null);
        }

        else {
            ResponseFactory responseFactory = new DescuentoResponseFactory();

            return responseFactory.getResponse(ResponseType.OK, "Descuento no encontrado", descuento);
        }
    }

    public Descuento addDescuento(Descuento descuento){
        return repo.save(descuento);
    }

    public Descuento updateDescuento(Descuento descuento){
        return repo.save(descuento);
    }

    public String deleteDescuento(String id){
        repo.deleteById(id);
        return "Descuento eliminado con éxito";
    }
}
