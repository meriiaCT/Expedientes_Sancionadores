
package expedientessancionadores;
import java.time.LocalDateTime;
import java.io.Serializable;
/**
 *
 * @author f.rivero.2016
 */
public class Conductor implements Serializable{
    private Carnet carnet;
    private String nombre;
    private String apellidos;    
    private String domicilio;
    private String email;    
            
    public Conductor(String nombre, String apellidos, String dni, String domicilio, String email, LocalDateTime fecha_obtencion, LocalDateTime fecha_caducidad, boolean gafas_lentillas){
        carnet=new Carnet(dni,fecha_obtencion,fecha_caducidad,gafas_lentillas);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.email = email;
    }
    
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }    
    
    
    public String getNombre(){
        return nombre;
    }    
    
    public String getApellidos(){
        return apellidos;
    } 
    
    public String getDomicilio(){
        return domicilio;
    } 
    
    public String getEmail(){
        return email;
    }  
    
    @Override    
    public String toString(){
        
        return "Datos del conductor --> Nombre: " + nombre + " Apellidos: " + apellidos +  " Domicilio: " + domicilio + " E-mail: " + email + carnet.toString()+". \n";
    }
    
    
}
