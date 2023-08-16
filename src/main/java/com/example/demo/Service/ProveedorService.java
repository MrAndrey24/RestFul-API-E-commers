package com.example.demo.Service;

import com.example.demo.Domain.Proveedor;
import com.example.demo.Repositories.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {
    @Autowired
    private ProveedorRepository repo;

    public List<Proveedor> getAll(){
        return repo.findAll();
    }

    public Proveedor getProveedor(String id){
        return repo.findById(id).orElse(null);
    }

    public Proveedor addProveedor(Proveedor proveedor){
        return repo.save(proveedor);
    }

    public Proveedor updateProveedor(Proveedor proveedor){
        return repo.save(proveedor);
    }

    public String deleteProveedor(String id){
        repo.deleteById(id);
        return "Proveedor eliminado con éxito";
    }
}
