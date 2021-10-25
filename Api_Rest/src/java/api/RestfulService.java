package api;

import bll.Controlador;
import bll.Funciones;
import bo.Usuario;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/usuarios")
public class RestfulService {
   
    @GET // Visualizar todos los Usuarios
    @Produces({MediaType.APPLICATION_JSON})      
    public List<Usuario> obtenerListadoUsuarios()
    {        
      Controlador controlador = Funciones.CrearControlador();
      return controlador.obtenerListadoUsuarios();
    }
        
    @GET // Visualizar un solo Usuario que se buscara por ID
    @Produces({MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Usuario buscarUsuario(@PathParam("id") int id)
    {           
      Controlador controlador = Funciones.CrearControlador();  
      Usuario usuario = (Usuario) controlador.obtenerUsuario(id);
      return usuario;
    }    

    @POST // Agregar un Usuario Nuevo
    @Consumes(MediaType.APPLICATION_JSON)
    public String agregarUsuario(Usuario usuario)
    {       
      int Resultado = -1;  
      String Mensaje = "";
        
      Controlador controlador = Funciones.CrearControlador();  
      Resultado = controlador.guardarUsuario(usuario);
      if (Resultado == 0)
      {
           Mensaje = "Registro Grabado Satisfactoriamente";     
      }    
      else
      {            
         Mensaje = "Error, no se pudo guardar el Registro";
      } 
      return Mensaje;      
    }
       
    @PUT // Actualizar un Usuario
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)  
    public String actualizarUsuario(Usuario usuario)
    {       

      int Resultado = -1;  
      String Mensaje = "";
        
      Controlador controlador = Funciones.CrearControlador();  
      Resultado = controlador.guardarUsuario(usuario);
      if (Resultado == 0)
      {
           Mensaje = "Registro Actualizado Satisfactoriamente";     
      }    
      else if (Resultado == -2)
      {            
         Mensaje = "Error, no existe este usuario";
      } 
      else
      {            
         Mensaje = "Error, Se ha producido un error accesando la base de datos";
      } 
      return Mensaje;      
    }
   
    @DELETE // Eliminar un Usuario
    @Path("{id}")  
    @Consumes(MediaType.APPLICATION_JSON)     
    public String eliminarUsuario(@PathParam("id") int id)
    {
      int Resultado = -1;  
      String Mensaje = "";
      Controlador controlador = Funciones.CrearControlador();  
      Resultado = controlador.eliminarUsuario(id);  
      if (Resultado == 0)
      {
           Mensaje = "Registro Eliminado Satisfactoriamente";     
      }    
      else if (Resultado == -2)
      {            
         Mensaje = "Error, no existe este usuario";
      } 
      else
      {            
         Mensaje = "Error, Se ha producido un error accesando la base de datos";
      } 
      return Mensaje;
    }
}
