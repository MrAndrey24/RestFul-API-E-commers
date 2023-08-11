package com.example.demo.Utils;

public class Validaciones {

    // singleton
    private static Validaciones instance = null;

    private Validaciones() {
    }

    public static Validaciones getInstance() {
        if (instance == null) {
            instance = new Validaciones();
        }
        return instance;
    }

    public boolean validarMoneda(String moneda) {
        return moneda.equals("USD") || moneda.equals("COP");
    }

    public boolean validarMetodoPago(String metodoPago) {
        return metodoPago.equals("Efectivo") || metodoPago.equals("Tarjeta");
    }

    public boolean validarCliente(String cliente) {
        return cliente.equals("Persona") || cliente.equals("Empresa");
    }
}
