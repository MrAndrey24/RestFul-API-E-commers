package com.example.demo.Service;

import com.example.demo.Domain.Descuento;
import com.example.demo.Domain.Empleado;
import com.example.demo.Repositories.EmpleadoRepository;
import com.example.demo.Responses.Factory.DescuentoResponseFactory;
import com.example.demo.Responses.Factory.EmpleadoResponseFactory;
import com.example.demo.Responses.Factory.ResponseFactory;
import com.example.demo.Responses.Response;
import com.example.demo.Responses.ResponseType;
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

    public Response getEmpleado(String id) {
        Empleado empleado = repo.findById(id).orElse(null);
        if (empleado == null) {
            EmpleadoResponseFactory empleadoResponseFactory = new EmpleadoResponseFactory();

            return
                    empleadoResponseFactory.getResponse(ResponseType.ERROR, "No se encontró el empleado", null);
        }

        else {
            ResponseFactory responseFactory = new EmpleadoResponseFactory();

            return responseFactory.getResponse(ResponseType.OK, "Empleado no encontrado", empleado);
        }
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
