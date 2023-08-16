package com.example.demo.Service;

import com.example.demo.Domain.Cliente;
import com.example.demo.Domain.Factura;
import com.example.demo.Repositories.ClienteRepository;
import com.example.demo.Responses.Factory.ClienteResponseFactory;
import com.example.demo.Responses.Factory.FacturaResponseFactory;
import com.example.demo.Responses.Factory.ResponseFactory;
import com.example.demo.Responses.Factory.StockResponseFactory;
import com.example.demo.Responses.Response;
import com.example.demo.Responses.ResponseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }

    public Response getCliente(String id) {

        Cliente cliente = clienteRepository.findById(id).orElse(null);
        if (cliente == null) {
            ClienteResponseFactory clienteResponseFactory = new ClienteResponseFactory();

            return
                    clienteResponseFactory.getResponse(ResponseType.ERROR, "No se encontró el cliente", null);
        }

        else {
            ResponseFactory clienteResponseFactory = new ClienteResponseFactory();

            return clienteResponseFactory.getResponse(ResponseType.OK, "Cliente encontrado", cliente);
        }
    }

    public Cliente addCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente updateCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public String deleteCliente(String id) {
        clienteRepository.deleteById(id);
        return "Cliente eliminado con éxito";
    }
}
