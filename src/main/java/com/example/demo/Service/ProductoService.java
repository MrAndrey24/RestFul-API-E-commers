package com.example.demo.Service;

import com.example.demo.Domain.Producto;
import com.example.demo.Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository repo;

    public List<Producto> getAll(){
        return repo.findAll();
    }

    public Producto getProducto(String id){
        return repo.findById(id).orElse(null);
    }

    public Producto addProducto(Producto producto){
         return repo.save(producto);
    }

    public Producto updateProducto(Producto producto){
         return repo.save(producto);
    }

    public String deleteProducto(String id){
          repo.deleteById(id);
          return "Producto eliminado con éxito";
    }
}
