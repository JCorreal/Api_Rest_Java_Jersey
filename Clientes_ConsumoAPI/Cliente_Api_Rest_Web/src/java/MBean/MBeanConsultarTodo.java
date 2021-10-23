package MBean;

import BO.Usuario;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MBeanConsultarTodo {
    private Usuario[] listadoGeneral;
    
    public MBeanConsultarTodo()
    {
     ConsultarTodos();
    }
    
    public Usuario[] getListadoGeneral() {
        return listadoGeneral;
    }

   
    public void setListadoGeneral(Usuario[] listadoGeneral) {
        this.listadoGeneral = listadoGeneral;
    }

    public void ConsultarTodos()
    {
      String miurl = "http://localhost:21185/Api_Rest/service/usuarios";
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
        String jsonAll = fichero;       
        listadoGeneral = gson.fromJson(jsonAll, Usuario[].class);
       }
       catch(IOException | RuntimeException e)
       {
         System.out.println(e.getMessage());
       }    
    }
    
    
}
