package com.example.demo.Service;

import com.example.demo.Domain.Tienda;
import com.example.demo.Repositories.TiendaRepository;
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

    public Tienda getTienda(String id){
        return repo.findById(id).orElse(null);
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
