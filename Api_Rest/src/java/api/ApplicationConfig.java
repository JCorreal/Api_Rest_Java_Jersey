package api;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/service")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        
        Set<Class<?>> resources = new java.util.HashSet<>();        
        System.out.println("Configuracion de API_REST iniciando: getClasses()");          
        resources.add(org.glassfish.jersey.jackson.JacksonFeature.class);       
        resources.add(MyJacksonJsonProvider.class);      
        resources.add(RestfulService.class);
        System.out.println("Configuracion de API_REST finalizada satisfactoriamente.");        
        return resources;
    }
    
    @Override
    public Set<Object> getSingletons() {
        return Collections.emptySet();
    }
    
    @Override
    public Map<String, Object> getProperties() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("jersey.config.server.wadl.disableWadl", true);        
        return properties;
    }    
}