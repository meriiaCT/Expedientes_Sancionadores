
package expedientessancionadores;

import java.time.*;

/**
 *
 * @author Adrian Castro
 */

public class Conductor {

    private String nombre;
    private String apellidos;
    private String dni;
    private String domicilio;
    private String email;
    private LocalDateTime fecha_obtencion;
    private LocalDateTime fecha_caducidad;
    private boolean gafas_lentillas;
  
    public Conductor(String nombre, String apellidos, String dni, 
            String domicilio, String email, LocalDateTime fecha_obtencion, 
            LocalDateTime fecha_caducidad, boolean gafas_lentillas){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.domicilio = domicilio;
        this.email = email;
        this.fecha_obtencion = fecha_obtencion;
        this.fecha_caducidad = fecha_caducidad;
        this.gafas_lentillas = gafas_lentillas;
    }
    
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    
    public void setFecha_caducidad(LocalDateTime fecha_caducidad){
        this.fecha_caducidad = fecha_caducidad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public String getDni(){
        return dni;
    }
    
    public String getDomicilio(){
        return domicilio;
    }
    
    public String getEmail(){
        return email;
    }
    
    public LocalDateTime getFecha_obtencion(){
        return fecha_obtencion;
    }
    
    public LocalDateTime getFecha_caducidad(){
        return fecha_caducidad;
    }
    
    public boolean getGafas_lentillas(){
        return gafas_lentillas;
    }
    
    @Override
    
    public String toString(){
        String auxString;
        if(gafas_lentillas == false){auxString = "No";}
        else{auxString = "Sí";}
        return "Datos del conductor --> Nombre: " + nombre + ". Apellidos: " + 
                apellidos + ". DNI: " + dni + ". Domicilio: " + domicilio + 
                ". E-mail: " + email + ". Fecha de obtención: " + 
                fecha_obtencion + ". Fecha de caducidad: " + fecha_caducidad + 
                ". Gafas o lentillas: " + auxString + ". \n";
    }
    
}
