package com.example.demo.Controllers;

import com.example.demo.Domain.Departamento;
import com.example.demo.Responses.Response;
import com.example.demo.Service.DepartamentoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/departamentos")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class DepartamentoController {
    @Autowired
    private DepartamentoService service;

    @GetMapping
    public List<Departamento> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Response getDepartamento(String id){
        return service.getDepartamento(id);
    }

    @PostMapping
    public Departamento addDepartamento(@RequestBody Departamento departamento){
        return service.addDepartamento(departamento);
    }

    @PutMapping("/{id}")
    public Departamento updateDepartamento(@PathVariable String id, @RequestBody Departamento departamento){
        departamento.setId(id);
        return service.updateDepartamento(departamento);
    }

    @DeleteMapping("/{id}")
    public String deleteDepartamento(@PathVariable String id){
        return service.deleteDepartamento(id);
    }
}
