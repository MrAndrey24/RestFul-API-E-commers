package com.example.demo.Service;

import com.example.demo.Domain.Descuento;
import com.example.demo.Repositories.DescuentoRepository;
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

    public Descuento getDescuento(String id){
        return repo.findById(id).orElse(null);
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
