package com.example.demo.Service;

import com.example.demo.Domain.Departamento;
import com.example.demo.Repositories.DepartamentoRepository;
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

    public Departamento getDepartamento(String id){
        return repo.findById(id).orElse(null);
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
