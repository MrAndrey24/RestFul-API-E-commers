package com.example.demo.Controllers;

import com.example.demo.Domain.Cliente;
import com.example.demo.Responses.Response;
import com.example.demo.Service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/clientes")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getClientes() {
        return clienteService.getClientes();
    }

    @GetMapping("/{id}")
    public Response getCliente(@PathVariable String id) {
        return clienteService.getCliente(id);
    }

    @PostMapping
    public Cliente addCliente(@RequestBody Cliente cliente) {
        return clienteService.addCliente(cliente);
    }

    @PutMapping("/{id}")
    public Cliente updateCliente(@PathVariable String id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        return clienteService.updateCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public String deleteCliente(@PathVariable String id) {
        return clienteService.deleteCliente(id);
    }
}
