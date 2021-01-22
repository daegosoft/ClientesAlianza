package com.services.testing;

import com.services.negocio.ClienteDAO;

public class ClienteTest {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();
        System.out.println(clienteDAO.obtenerClientes());
        System.out.println(clienteDAO.buscarCliente("jgutierrez"));
    }
   
}
