package com.example.demo.Service;

import com.example.demo.Domain.Proveedor;
import com.example.demo.Repositories.ProveedorRepository;
import com.example.demo.Responses.Factory.ProveedorResponseFactory;
import com.example.demo.Responses.Factory.ResponseFactory;
import com.example.demo.Responses.Response;
import com.example.demo.Responses.ResponseType;
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

    public Response getProveedor(String id){
        Proveedor proveedor = repo.findById(id).orElse(null);
        if (proveedor == null) {
            ProveedorResponseFactory proveedorResponseFactory = new ProveedorResponseFactory();

            return proveedorResponseFactory.getResponse(ResponseType.ERROR, "No se encontró el proveedor", null);
        } else {
            ResponseFactory responseFactory = new ProveedorResponseFactory();

            return responseFactory.getResponse(ResponseType.OK, "Proveedor no encontrado", proveedor);
        }
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
