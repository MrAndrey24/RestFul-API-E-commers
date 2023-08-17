package com.example.demo.Service;

import com.example.demo.Domain.Tienda;
import com.example.demo.Repositories.TiendaRepository;
import com.example.demo.Responses.Factory.ResponseFactory;
import com.example.demo.Responses.Factory.TiendaResponseFactory;
import com.example.demo.Responses.Response;
import com.example.demo.Responses.ResponseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiendaService {
    @Autowired
    private TiendaRepository repo;


    public List<Tienda> getAll(){
        return repo.findAll();
    }

    public Response getTienda(String id){
        Tienda tienda = repo.findById(id).orElse(null);
        if (tienda == null) {
            TiendaResponseFactory tiendaResponseFactory = new TiendaResponseFactory();

            return tiendaResponseFactory.getResponse(ResponseType.ERROR, "No se encontró la tienda", null);
        } else {
            ResponseFactory responseFactory = new TiendaResponseFactory();

            return responseFactory.getResponse(ResponseType.OK, "Tienda no encontrada", tienda);
        }
    }

    public Tienda addTienda(Tienda tienda){
         return repo.save(tienda);
    }

    public Tienda updateTienda(Tienda tienda){
         return repo.save(tienda);
    }

    public String deleteTienda(String id){
          repo.deleteById(id);
          return "Tienda eliminada con éxito";
    }
}
