package com.example.demo.Service;

import com.example.demo.Domain.Producto;
import com.example.demo.Repositories.ProductoRepository;
import com.example.demo.Responses.Factory.ProductoResponseFactory;
import com.example.demo.Responses.Factory.ResponseFactory;
import com.example.demo.Responses.Response;
import com.example.demo.Responses.ResponseType;
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

    public Response getProducto(String id){
        Producto producto = repo.findById(id).orElse(null);
        if (producto == null) {
            ProductoResponseFactory productoResponseFactory = new ProductoResponseFactory();

            return productoResponseFactory.getResponse(ResponseType.ERROR, "No se encontró el producto", null);
        } else {
            ResponseFactory responseFactory = new ProductoResponseFactory();

            return responseFactory.getResponse(ResponseType.OK, "Producto no encontrado", producto);
        }

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
