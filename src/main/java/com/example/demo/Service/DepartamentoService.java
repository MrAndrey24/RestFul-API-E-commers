package com.example.demo.Service;

import com.example.demo.Domain.Cliente;
import com.example.demo.Domain.Departamento;
import com.example.demo.Repositories.DepartamentoRepository;
import com.example.demo.Responses.Factory.ClienteResponseFactory;
import com.example.demo.Responses.Factory.DepartamentoResponseFactory;
import com.example.demo.Responses.Factory.DescuentoResponseFactory;
import com.example.demo.Responses.Factory.ResponseFactory;
import com.example.demo.Responses.Response;
import com.example.demo.Responses.ResponseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {
    @Autowired
    private DepartamentoRepository repo;

    public List<Departamento> getAll(){
        return repo.findAll();
    }

    public Response getDepartamento(String id){
        Departamento departamento = repo.findById(id).orElse(null);
        if (departamento == null) {
            DepartamentoResponseFactory descuentoResponseFactory = new DepartamentoResponseFactory();

            return
                    descuentoResponseFactory.getResponse(ResponseType.ERROR, "No se encontró el cliente", null);
        }

        else {
            ResponseFactory responseFactory = new DepartamentoResponseFactory();

            return responseFactory.getResponse(ResponseType.OK, "Departamento no encontrado", departamento);
        }
    }

    public Departamento addDepartamento(Departamento departamento){
        return repo.save(departamento);
    }

    public Departamento updateDepartamento(Departamento departamento){
        return repo.save(departamento);
    }

    public String deleteDepartamento(String id){
        repo.deleteById(id);
        return "Departamento eliminado con éxito";
    }
}
