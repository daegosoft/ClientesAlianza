package com.services.REST;

import com.services.negocio.ClienteDAO;
import com.services.vo.Cliente;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("/cliente")
public class ClienteREST{
    
    @Inject
    ClienteDAO clienteDAO;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerClientes(){
        List<Cliente> clientes = clienteDAO.obtenerClientes();
        if(clientes.isEmpty()){
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "Error Consultado Clientes");
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Error Consultado Clientes").build();
        }
        return Response.ok().entity(clientes).build();
        //return clientes;
    }
    
    @GET
    @Path("/buscar")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarCliente(@QueryParam("sharedKey") String sharedKey){
        Cliente clientes = clienteDAO.buscarCliente(sharedKey);
        if(clientes == null){
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "Error Buscando Cliente");
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Error Buscando Cliente " + sharedKey).build();
        }
        return Response.ok().entity(clientes).build();
        //return clientes;
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response buscarCliente(Cliente cliente){
        if(!clienteDAO.crearCliente(cliente)){
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "Error Creando Cliente");
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Error Creando Cliente.").build();
        }
        return Response.ok().entity(true).build();
        //return clientes;
    }
}
