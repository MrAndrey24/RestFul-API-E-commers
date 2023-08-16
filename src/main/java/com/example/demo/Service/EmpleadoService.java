package com.example.demo.Service;

import com.example.demo.Domain.Empleado;
import com.example.demo.Repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepository repo;

    public List<Empleado> getEmpleados() {
        return repo.findAll();
    }

    public Empleado getEmpleado(String id) {
        return repo.findById(id).orElse(null);
    }

    public Empleado addEmpleado(Empleado empleado) {
        return repo.save(empleado);
    }

    public Empleado updateEmpleado(Empleado empleado) {
        return repo.save(empleado);
    }

    public String deleteEmpleado(String id) {
        repo.deleteById(id);
        return "Empleado eliminado con éxito";
    }
}
