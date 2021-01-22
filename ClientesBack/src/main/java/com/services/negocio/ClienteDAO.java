package com.services.negocio;

import com.services.vo.Cliente;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class ClienteDAO {
    
    List<Cliente> clientes;
    
    public ClienteDAO(){
        this.clientes = new ArrayList<>();
        Cliente cliente = new Cliente("jgutierrez", "Juliana Gutierrez", "jgutierrez@gmail.com", 3219876543f, new Date());
        this.clientes.add(cliente);
        cliente = new Cliente("mmartinez", "Manuel Martinez", "mmartinez@gmail.com", 3219876543f, new Date());
        this.clientes.add(cliente);
        cliente = new Cliente("aruiz", "Ana Ruiz", "aruiz@gmail.com", 3219876543f, new Date());
        this.clientes.add(cliente);
        cliente = new Cliente("ogarcia", "Oscar Garcia", "ogarcia@gmail.com", 3219876543f, new Date());
        this.clientes.add(cliente);
    }
    
    public List<Cliente> obtenerClientes(){
        return this.clientes;
    }
    
    public Cliente buscarCliente(String sharedKey){
        Cliente cliente = null;
        for(Cliente c: this.clientes){
            if(c.getSharedKey().equals(sharedKey)){
                cliente = c;
            }
        }
        return cliente;
    }
    
    public boolean crearCliente(Cliente cliente){
        Cliente cli = this.buscarCliente(cliente.getSharedKey());
        if(cli == null){
            this.clientes.add(cliente);
            return true;
        }else{
            return false;
        }
    }
}
