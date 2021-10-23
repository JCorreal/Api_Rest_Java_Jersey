package MBean;

import BLL.Funciones;
import BO.Usuario;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

public class MBeanGeneral {
    private Usuario usuario = new Usuario();
    private boolean ActivarCampo = true;
    private String respuesta="";
     
    public MBeanGeneral()
    {     
      if (Funciones.DatoBuscar==0)
      { 
          this.usuario = new Usuario ();   
      }        
    }
   
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean isActivarCampo() {
        return ActivarCampo;
    }

    public void setActivarCampo(boolean ActivarCampo) {
        this.ActivarCampo = ActivarCampo;
    }     

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
   
        
    public void BuscarUsuario() 
    {
      if (this.usuario.getUsuario_id()!=0)  
      {
      String miurl = "http://localhost:21185/Api_Rest/service/usuarios/" +  this.usuario.getUsuario_id();
      try
      {        
        URL url = new URL(miurl); // creamos una URL donde esta nuestro webservice
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();        
        conn.setRequestMethod("GET"); // Indicamos por que verbo HTML ejecutaremos la solicitud
        conn.setRequestProperty("Accept", "application/json");
        if (conn.getResponseCode() != 200) 
        { // si la respuesta del servidor es distinta al codigo 200 lanzaremos una Exception
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
        }
        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
        String linea;
        String fichero = "";
      
        while ((linea = br.readLine()) != null)
        {
           fichero += linea;           
        }
        Gson gson = new Gson();
        Properties properties = gson.fromJson(fichero, Properties.class);
        this.usuario.setUsuario_id(Integer.parseInt(properties.get("usuario_id").toString()));
        this.usuario.setNombres(properties.get("nombres").toString());
        this.usuario.setApellidos(properties.get("apellidos").toString());
        Funciones.DatoBuscar=0;
        conn.disconnect();
    }      
    catch(IOException | RuntimeException e)
    {
        System.out.println(e.getMessage());
    }    
  }
 }
    
    
    
    public String Editar(int Codigo)
    {
        this.usuario.setUsuario_id(Codigo); 
        Funciones.DatoBuscar = Codigo;
        BuscarUsuario();
        return "Usuarios";
    }
    
    public void Grabar()
    {
        if (Funciones.DatoBuscar==0)
        {
            AgregarUsuario();            
        }
        else
        {
            ActualizarUsuario();
        }
    }
    
    public void AgregarUsuario()
    {
      try 
        {
	   URL url = new URL("http://localhost:21185/Api_Rest/service/usuarios");
           HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	   conn.setDoOutput(true);
	   conn.setRequestMethod("POST");
	   conn.setRequestProperty("Content-Type", "application/json");        
           usuario.setUsuario_id(0);
           usuario.setNombres(this.usuario.getNombres());
           usuario.setApellidos(this.usuario.getApellidos());
           System.out.println(this.usuario.getNombres()); System.out.println(this.usuario.getApellidos());
           Gson gson = new Gson();
           String json = gson.toJson(usuario);
   	   OutputStream os = conn.getOutputStream();
	   os.write(json.getBytes());
	   os.flush();
           os.close();
     	   if (conn.getResponseCode() != 200) 
           { // si la respuesta del servidor es distinta al codigo 200 lanzaremos una Exception
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
           }
    	   BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
           String output = br.readLine();
	   conn.disconnect(); 
           this.respuesta = output;
        } 
        catch (IOException | RuntimeException e)
        {
         System.out.println("Error: " + e);
	}
    }

    public void ActualizarUsuario()
    {
      String miurl = "http://localhost:21185/Api_Rest/service/usuarios/" +Funciones.DatoBuscar;
      try
      {        
           URL url = new URL(miurl); // creamos una URL donde esta nuestro webservice 
           HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	   conn.setDoOutput(true);
	   conn.setRequestMethod("PUT");
	   conn.setRequestProperty("Content-Type", "application/json");
           Gson gson = new Gson();
           
           usuario.setUsuario_id(Funciones.DatoBuscar);
           usuario.setNombres(usuario.getNombres());
           usuario.setApellidos(usuario.getApellidos());
           String json = gson.toJson(usuario);
   	   OutputStream os = conn.getOutputStream();
	   os.write(json.getBytes());
	   os.flush();
           os.close();
     	   if (conn.getResponseCode() != 200) 
           { // si la respuesta del servidor es distinta al codigo 200 lanzaremos una Exception
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
           }
    	   BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
           String output = br.readLine();
           conn.disconnect();        
           Funciones.DatoBuscar=0;
           this.respuesta = output;
        } 
        catch (IOException | RuntimeException e)
        {
         System.out.println("Error: " + e);
	}
    }
    
    public String Eliminar(int Codigo)
    {
      try 
        {
         String miurl = "http://localhost:21185/Api_Rest/service/usuarios/" + Codigo;
         URL url = new URL(miurl); // creamos una URL donde esta nuestro webservice
         HttpURLConnection conn = (HttpURLConnection) url.openConnection();        
         conn.setRequestMethod("DELETE"); // Indicamos por que verbo HTML ejecutaremos la solicitud
         conn.setRequestProperty("Accept", "application/json");
         if (conn.getResponseCode() != 200) 
         { // si la respuesta del servidor es distinta al codigo 200 lanzaremos una Exception
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
         }         
         BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
         String output = br.readLine();
	 conn.disconnect();        	   
         Funciones.DatoBuscar=0;
         this.respuesta = output;
        } 
        catch (IOException | RuntimeException e)
        {
         System.out.println("Error: " + e);
	}
        return "Eliminado";
    }
}
