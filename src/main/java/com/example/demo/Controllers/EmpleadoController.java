package com.example.demo.Controllers;

import com.example.demo.Domain.Empleado;
import com.example.demo.Responses.Response;
import com.example.demo.Service.EmpleadoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/empleados")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class EmpleadoController {
    @Autowired
    private EmpleadoService service;

    @GetMapping
    public List<Empleado> getAll() {
        return service.getEmpleados();
    }

    @GetMapping("/{id}")
    public Response getEmpleado(String id) {
        return service.getEmpleado(id);
    }

    @PostMapping
    public Empleado addEmpleado(@RequestBody Empleado empleado) {
        return service.addEmpleado(empleado);
    }

    @PutMapping("/{id}")
    public Empleado updateEmpleado(@PathVariable String id, @RequestBody Empleado empleado) {
        empleado.setId(id);
        return service.updateEmpleado(empleado);
    }

    @DeleteMapping("/{id}")
    public String deleteEmpleado(@PathVariable String id) {
        return service.deleteEmpleado(id);
    }
}
